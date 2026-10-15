class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currentEnd =0;
        int fastestJump = 0;
        for(int i=0 ; i<nums.length-1; i++){
            fastestJump = Math.max(fastestJump, nums[i]+i);
            if(i==currentEnd){
                jump++;
                currentEnd = fastestJump;
            }
        }
        return jump;
    }
}