class Solution {
    public boolean isAnagram(String s, String t) {
        int m = t.length(); 
         int n = s.length(); 
         if(m!=n){
            return false;
         }  
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        int count = 0;
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i = 0;
      
        while(i<n){
            if(s1[i]!=t1[i]){
                return false;
            }
            if(s1[i]==t1[i]){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        if(count!=n){
            return false;
        }
        return true;
    }
}