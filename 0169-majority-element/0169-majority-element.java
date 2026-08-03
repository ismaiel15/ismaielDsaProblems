class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length>1){
                for (int i=0;i<nums.length-1;i++){
        int n=nums.length;
        int count = 1;
        for(int j=i+1; j<n; j++){
            if(nums[i]==nums[j]){
                count++;
            }
          if( nums[i]==nums[j] && count>n/2){
                return nums[i];
            }
        }
    }
        }
        else{
            return nums [0];
        }

      return 0;

  }

   
}

