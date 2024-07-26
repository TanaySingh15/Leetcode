class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=nums[0],index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curr){
                nums[i] = -101;
            }else{
                nums[++index] = nums[i];
                curr = nums[i];
            }
        }
        return index+1;
    }
}