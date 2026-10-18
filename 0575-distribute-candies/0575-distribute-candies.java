class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 1;
        int n = candyType.length;
        int opt = candyType.length/2;
        int i=0;
        Arrays.sort(candyType);
        while(i<n-1){
            if(candyType[i]!=candyType[i+1] && count<opt){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
    return count;
    }
}