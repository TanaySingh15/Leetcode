class Solution {
    public boolean check(int[] nums) {
        int rotations = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rotations++;
            }
        }
        if(rotations>1) return false;
        else {
            if(nums[0]<nums[nums.length-1] && rotations!=0) return false;
            return true;
        }
    }
}