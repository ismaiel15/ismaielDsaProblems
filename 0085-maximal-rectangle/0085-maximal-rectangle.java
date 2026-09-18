class Solution {
    public int maxArea(int[]arr){
        int nsr[] = new int[arr.length];
        int nsl[] = new int [arr.length];
        Stack<Integer> s = new Stack<>();
        //nsr
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                 nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //nsl
        s = new Stack<>();
         for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[ s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                 nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //calculate area
        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
           int  width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;

    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;

        //histogram height;
        int ans[] = new int[m];
        int maxRectangle = 0;

        for(int i=0; i<n; i++){
            for(int j=0 ; j<m ; j++){
               if(matrix[i][j]=='1'){
                ans[j]++;
               }else{
                ans[j]=0;
               }
            } 
            int currentArea = maxArea(ans);
            maxRectangle = Math.max(maxRectangle,currentArea);
        }
       
        return maxRectangle;
    }
}