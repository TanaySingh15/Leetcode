class Solution {
    public int majorityElement(int[] nums) {
        int max = nums[0],count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == max) count++;
            else count--;
            if(count < 0) {
                max = nums[i];
                count = 1;
            }
        }
        // System.out.println(max);
        count = 0;
        for(int i:nums){
            if(i == max) count++;
        }
        if(count > (nums.length/2)) return max;

        return -1;
    }
}