class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> temp = new ArrayList<>();
        int n = rowIndex;
        long ans  = 1;
        temp.add((int)ans);
        for(int i=1; i<=n; i++){
            ans = ans*(n-i+1);
            ans = ans/i;
            temp.add((int)ans);
        }
        return temp;
    }
}