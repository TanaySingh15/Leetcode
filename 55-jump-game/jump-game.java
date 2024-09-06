class Solution {
    public boolean canJump(int[] nums) {
        return jump(0, nums, new Boolean[nums.length]);
    }

    private boolean jump(int indx, int[] nums, Boolean[] memo) {
        if (indx >= nums.length - 1) {
            return true;
        }
        if (nums[indx] == 0) {
            return false;
        }
        if (memo[indx] != null) {
            return memo[indx];
        }

        for (int i = 1; i <= nums[indx]; i++) {
            if (jump(indx + i, nums, memo)) {
                memo[indx] = true;
                return true;
            }
        }

        memo[indx] = false;
        return false;
    }
}