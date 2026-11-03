class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n = s.length();
        int sign = 1;
        long nums=0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            nums = nums * 10+digit;
            i++;

            if(nums*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(nums*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)(nums*sign);
    }
}