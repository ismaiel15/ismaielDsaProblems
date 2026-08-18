class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            // trim the duplicates;
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            // find the left half is sorted or not
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            // find the right half is sorted or not
           else{
                // check the target value is present or not
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}