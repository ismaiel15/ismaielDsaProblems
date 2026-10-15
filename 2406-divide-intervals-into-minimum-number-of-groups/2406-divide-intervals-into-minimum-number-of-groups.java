class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int arr[] = new int[n];
        int dep[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = intervals[i][0];
            dep[i] = intervals[i][1];
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count= 0;
        int maxCount = 0;
        while(i<n){
            if(arr[i]<=dep[j]){
                i++;
                count++;
            }
            else{
                j++;
                count--;
            }
            maxCount =Math.max(count,maxCount);
        }
        return maxCount;
    }
}