class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lp = nums.length-1;
        if(n==1 && nums[n-1]==0){
            System.out.print(nums[n-1]+" ");
        }
        else{
              for(int i = 0; i<=lp ; i++){
            if(nums[i]==0){
               int temp = nums[i];
                for(int j=i; j<lp; j++){
                    nums[j]=nums[j+1];
                }
                nums[lp] = temp;
                lp --;
                i--;
             
            }
        }

        }
      
        
    }
}