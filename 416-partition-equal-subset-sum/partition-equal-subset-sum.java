class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        if(sum%2!=0) 
        return false;
        else
        return bottomUp(nums.length,nums,sum/2);
    }

    boolean recursive(int n,int wt[],int s1,int s2){
        if(s1 == s2) return true;
        if(n==0) return false;
        if(wt[n-1]<=s1)
         return recursive(n-1,wt,s1-wt[n-1],s2+wt[n-1]) || recursive(n-1,wt,s1,s2);
        else 
         return false;
    }

    boolean bottomUp(int n,int wt[],int W){
        boolean[][] dp=new boolean[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }
        dp[0][0] = true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j)
                dp[i][j] = dp[i-1][j-wt[i-1]] || dp[i-1][j];
                else
                dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp[n][W];
    }
}