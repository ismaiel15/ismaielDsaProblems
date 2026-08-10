class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     ArrayList <Integer> list = new ArrayList<>();
     int startR = 0;
     int startC = 0;
     int endR = matrix.length-1;
     int endC =matrix[0].length-1;
     while(startR<=endR && startC<=endC){
        //upper row
     for(int j=startC ; j<=endC ; j++){
        list.add(matrix[startR][j]);
     }
     //right column
     for(int i=startR+1; i<= endR; i++){
        list.add(matrix[i][endC]);
     }
     //lower bottom
     for(int j=endC-1; j>=startC;j--){
        if(startR==endR){
            break;
        }
        list.add(matrix[endR][j]);
     }
     //left column
     for(int i=endR-1; i>startR;i--){
        if(startC==endC){
            break;
        }
        list.add(matrix[i][startC]);
     }
     startR++;
     startC++;
     endR--;
     endC--;
     }
     return list;
    }
}