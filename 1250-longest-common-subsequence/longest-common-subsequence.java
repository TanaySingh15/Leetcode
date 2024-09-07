class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(),m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] = -1;
            }
        }
        return bottomUp(text1,n,text2,m);
    }

    public int recursive(String a,int n,String b,int m){
        if(n==0 || m==0) return 0;
        if(a.charAt(n-1)==b.charAt(m-1))
            return 1+recursive(a.substring(0,n-1),n-1,b.substring(0,m-1),m-1);
        else
            return Math.max(recursive(a.substring(0,n-1),n-1,b,m),recursive(a,n,b.substring(0,m-1),m-1));
    }

    public int topDown(String a,int n,String b,int m,int[][] dp){
        if(n==0 || m==0)
            dp[n][m]=0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(a.charAt(n-1)==b.charAt(m-1))
            dp[n][m] = 1+topDown(a.substring(0,n-1),n-1,b.substring(0,m-1),m-1,dp);
        else
            dp[n][m] = Math.max(topDown(a.substring(0,n-1),n-1,b,m,dp),topDown(a,n,b.substring(0,m-1),m-1,dp));
        
        return dp[n][m];
    }

    public int bottomUp(String a,int n,String b,int m){
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

}