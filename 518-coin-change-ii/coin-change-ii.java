class Solution {
    public int change(int amount, int[] coins) {
        return bottomUp(coins,coins.length,amount);
    }

    public int bottomUp(int price[],int n,int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        dp[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(price[i-1]<=j)
                    dp[i][j] = dp[i-1][j]+dp[i][j-price[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}