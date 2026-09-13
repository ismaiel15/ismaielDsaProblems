class Solution {
    public int[] nextGreaterElements(int[] nums) {
           int n = nums.length;
        int[] ans = new int[n];

        // Initially every answer is -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> s = new Stack<>();

        // Traverse array twice
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!s.isEmpty() && nums[s.peek()] <= nums[index]) {
                s.pop();
            }

            // Only fill answer during the first traversal
            if (i < n) {
                if (!s.isEmpty()) {
                    ans[index] = nums[s.peek()];
                }
            }

            s.push(index);
        }

        return ans;
    }
}