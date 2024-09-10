class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        // return recursion(nums,n,0,-1);
        return topDown(nums,n,0,-1,dp);
    }

    int recursion(int[] nums,int n,int index,int prev_index){
        if(index==n) return 0;
        int length = recursion(nums,n,index+1,prev_index);
        if(prev_index == -1 || nums[index]>nums[prev_index]) 
            length = Math.max(length,recursion(nums,n,index+1,index)+1);
        return length;
    }

    int topDown(int[] nums,int n,int index,int prev_index,int[][] dp){
        if(index==n) {
            return 0; 
        }
        if(dp[index][prev_index+1]!= -1) return dp[index][prev_index+1];
        int length = topDown(nums,n,index+1,prev_index,dp);
        if(prev_index == -1 || nums[index]>nums[prev_index]) 
            length = Math.max(length,topDown(nums,n,index+1,index,dp)+1);
        dp[index][prev_index+1] = length;
        return dp[index][prev_index+1];
    }
}