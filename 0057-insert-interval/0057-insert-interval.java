class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int ans[][] = new int[n+1][2];
        int i = 0;
        int index = 0;
        while(i<n && intervals[i][1]<newInterval[0]){
            ans[index][0] = intervals[i][0];
            ans[index][1] = intervals[i][1];
            i=i+1;
            index++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i=i+1;
        }
        ans[index][0] = newInterval[0];
        ans[index][1] = newInterval[1];
        index++;
        
        while(i<n){
            ans[index][0] = intervals[i][0];
            ans[index][1] = intervals[i][1];
            i = i+1;
            index++;
        }
        return java.util.Arrays.copyOf(ans, index);
    }
}