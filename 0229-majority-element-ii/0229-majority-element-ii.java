class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count=0;
        int n = nums.length;
        int l = n/3;
        for(int i=0; i<n; i++){
            if(ans.size()==0|| ans.get(0)!=nums[i]){
                count=0;
                for(int j=0; j<n; j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count>l){
                    ans.add(nums[i]);
                }
                 if(ans.size()==2){
                break;
            }
            }
           
        }
        return ans;
    }
}