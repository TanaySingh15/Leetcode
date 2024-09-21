class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int i = 0, j = 0, sum = 0;
        int len = nums.length;

        while (i < len) {
            sum += nums[i++];

            // When the sum is greater than or equal to the target, shrink the window
            while (sum >= target) {
                minLength = Math.min(minLength, i - j); // Update minimum length
                sum -= nums[j++]; // Shrink the window by moving j to the right
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }
}