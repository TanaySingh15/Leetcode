class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1]>0){
                nums[index-1] = -1*nums[index-1];
            } else{
                return index;
            }
        }
        return -1;
    }
}