class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 0;
        int j;
        int n = nums.length;
        for(j=1 ; j<n ; j++){
            if(nums[i]!=nums[j]){
                k++;
                i+=1;
                nums[i]=nums[j];
            }
        }
          return k;
    }
}