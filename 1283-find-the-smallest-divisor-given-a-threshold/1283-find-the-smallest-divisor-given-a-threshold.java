class Solution {
    public boolean possible(int [] nums, int mid, int threshold){
        int n = nums.length;
        long count = 0;
        for(int i=0; i<n; i++){
            count += (nums[i]+mid-1)/mid;
        }
        if(count<=threshold){
            return true;
        }
        else{
            return false;
        }

    }
      public int high(int[]nums){
        int high = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
           high = Math.max(nums[i],high);
        }
        return high;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = high(nums);
        int n = nums.length;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(nums,mid,threshold)==true){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}