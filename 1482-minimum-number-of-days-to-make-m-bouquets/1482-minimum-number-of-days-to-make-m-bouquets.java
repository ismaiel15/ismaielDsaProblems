class Solution {
    public boolean possible(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int numberOfBouque = 0;
        int n = bloomDay.length;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                numberOfBouque += count/k;
                count = 0;
            }
        }
            numberOfBouque += count/k;

        if(numberOfBouque>=m){
            return true;
        }
     
            return false;
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        if(n<m*k){
            return -1;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
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