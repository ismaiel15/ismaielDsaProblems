class Solution {
    public int maxProduct(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            if(prefix==0){
            prefix = 1;
        }
        if(suffix==0){
            suffix = 1;
        }
        prefix *= nums[i];
        suffix *= nums[n-i-1];
      int max = Math.max(prefix,suffix);
      maximum = Math.max(maximum,max);
        }
        return maximum;
    }
}