class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = "";
        for (int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i); //extracts each character
            s2= ch+s2; //adds each character in front of the existing string
        }
        return LCS(s,s.length(),s2,s2.length());
    }

    int LCS(String a,int n,String b,int m){
        int[][] dp = new int [n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}