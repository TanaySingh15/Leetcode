class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMax = Integer.MIN_VALUE, globalMin = Integer.MAX_VALUE;
        int localMax = 0, localMin = 0, localSum = 0;
        for (int num : nums) {
            localMax = localMax + num;
            localMin = localMin + num;
            localSum = localSum + num;
            globalMin = Math.min(globalMin, localMin);
            globalMax = Math.max(globalMax, localMax);
            if (localMax < 0) localMax = 0;
            if (localMin > 0) localMin = 0;
        }
        if(localSum - globalMin == 0) return globalMax;
        return Math.max(globalMax,localSum - globalMin);
    }
}