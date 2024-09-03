class Solution {
    public static int findTargetSumWays(int[] nums, int target) {
        return recursive(nums,target,nums.length);
    }

    public static int recursive(int[] wt, int w, int n) {
        if(n==0){
            if(w==0){
                return 1;
            } else {
                return 0;
            }
        }
        return recursive(wt,w-wt[n-1],n-1)+recursive(wt,w+wt[n-1],n-1);
    }
}