class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
      
       // fixed the target in first array
       for(int i=0; i<nums1.length; i++){  
        Stack <Integer> s = new Stack<>();
        int target = nums1[i];
        int result = -1;

        for(int j=nums2.length-1; j>=0; j--){
          while(!s.isEmpty() && s.peek()<=nums2[j]){
            s.pop();
          }
          if(nums2[j]==target){
            if(!s.isEmpty()){
               result = s.peek();
            }
            break;
          }
          s.push(nums2[j]);
        }
        ans[i] = result;
       }
       return ans;
    }
}