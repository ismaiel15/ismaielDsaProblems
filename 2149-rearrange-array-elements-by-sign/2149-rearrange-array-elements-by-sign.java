class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int i=0;
        int positive = 0;
        int negative = 1;
        while(i<n){
            if(nums[i]>0){
                result[positive] = nums[i];
                i++;
                positive+=2;
            }
            else{
                result[negative] = nums[i];
                i++;
                negative+=2;
            }
        }
        return result;
    }
}