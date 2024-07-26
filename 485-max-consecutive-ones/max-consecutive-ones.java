class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max = Math.max(count,max);
                count = 0;
            }
            else{
                count++;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}