class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;  
                 break;
            }
         
        }
    
    if(index==-1){
       reverse(nums,0,n-1);
         return;
    }
    else{
        for(int i=n-1; i>index; i--){
            if(nums[i]>nums[index]){
                int a = nums[i];
                nums[i] = nums[index];
                nums[index] = a;
                break;
            }
        }
        reverse(nums,index+1,n-1);
    }
}
public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }
}

}