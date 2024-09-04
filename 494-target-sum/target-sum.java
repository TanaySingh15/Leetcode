class Solution {

    /*intution
        we have to divide the array into s1 and s2 and their difference would be equal to target
        therefore s1 - s2 = target
        also      s1 + s2 = sum of array
        hence     2s1 = target + sum of array
        thus we have to find a sub array having sum = (target+sumArray)/2;
    */


    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        int sum = Arrays.stream(nums).sum()+target;
        if(sum < 0 || sum % 2 == 1)return 0;
        sum = sum/2;
        int dp[][] = new int[n+1][sum+1];
        dp[0][0]=1;
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(nums[i-1]<=j)dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }

    public static int bottomUp(int[] wt,int w,int n){
        int[][] dp = new int[n+1][w+1];
        dp[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = dp[i-1][j-wt[i-1]]+dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
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