class Solution {
    public int day(int []weights, int days,int mid){
        int day =1;
        int load = 0;
        int n = weights.length;
        for(int i=0; i<n; i++){
            if(load+weights[i]>mid){
                day = day+1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
    public int sum(int []weights){
        int sum = 0;
        int n= weights.length;
        for(int i=0; i<n; i++){
            sum += weights[i];
        }
        return sum;
    }
    public int maximum(int[] weights){
        int n = weights.length;
        int max = weights[0];
        for(int i=1; i<n; i++){
            max = Math.max(weights[i],max);
        }
        return max;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = maximum(weights);
        int high = sum(weights);
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int noOfDays = day(weights,days,mid);
            if(noOfDays<=days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}