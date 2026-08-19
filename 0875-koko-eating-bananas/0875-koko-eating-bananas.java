class Solution {
    public static int totalHrs(int[]piles, int hour){
        int n = piles.length;
        int hrs = 0;
        for(int i=0; i<=n-1; i++){
            hrs+= Math.ceil(piles[i]+hour-1)/hour;
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int n = piles.length;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
           int time=  totalHrs(piles,mid);
           if(time<=h){
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