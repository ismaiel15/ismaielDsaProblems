class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int i=0;
        int count = 0;
        while(i<n){
            if(nums[i]<min){
                min = nums[i];
            }
           if(nums[i]>max){
                max = nums[i];
            }
            i++;
        }
        for(i=0; i<n; i++){
            if(nums[i]>min && nums[i]<max){
                count++;
            }
        }
        return count;
    }
}