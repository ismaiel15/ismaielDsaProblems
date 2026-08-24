class Solution {
    public int split(int []nums,int mid){
        int student = 1;
        int splitS = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(splitS + nums[i]<=mid){
                splitS += nums[i];
            }
            else{
                student++;
                splitS = nums[i];
            }
        }
        return student;
    }
    public int max(int[] nums){
        int n = nums.length;
        int max = nums[0];
        for(int i=1;i<n;i++){
            max = Math.max(nums[i],max);
        }
        return max;
    }
    public int sum(int[]nums){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
        int low = max(nums);
        int high = sum(nums);
        while(low<=high){
            int mid = (low+high)/2;
            int noOfSplit = split(nums,mid);
            if(noOfSplit>k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}