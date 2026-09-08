class Solution {
    public String reverse(char[] s){
        Stack <Character> sc = new Stack<>();
        int idx = 0;
        while(idx < s.length){
            sc.push(s[idx]);
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!sc.isEmpty()){
             char curr = sc.pop();
        result.append(curr);
        }
       return result.toString();
    }
    public void reverseString(char[] s) {
        String res = reverse(s);
        int idx = 0;
        while(idx < res.length()){
            s[idx] = res.charAt(idx);
            idx++;
        }
    }
}