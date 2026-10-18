class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int i=0;
        int j=0;
        while(i<n){
            if( i<n-1 && grid[i][j] != grid[i+1][j]){
                return false;
            }
             if( j<m-1 && grid[i][j] == grid[i][j+1]){
                return false;
            }
            if(j==m-1){
                i++;
                j=0;
            }
            else{
                  j++;
            }
          
        }
        return true;
        
    }
}