class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        // Clear stack
        st.clear();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        long sum = 0;

        // Calculate contribution
        for (int i = 0; i < n; i++) {

            int left = i - pse[i];
            int right = nse[i] - i;

            sum += (long) arr[i] * left * right;
        }

        return (int)(sum % 1000000007);
    }
}