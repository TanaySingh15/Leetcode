class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        if(str1.equals(str2)) return str1;
         int[][] dp=new int[str1.length()+1][str2.length()+1];
         int i=0,j=0;
         for(i=0;i<=str1.length();i++){
             for(j=0;j<=str2.length();j++){
                 if(i==0 || j==0){
                     dp[i][j]=0;
                 }
                 else{
                     if(str1.charAt(i-1)==str2.charAt(j-1)){
                         dp[i][j]=dp[i-1][j-1]+1;
                     }
                     else{
                         dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                     }
                 }
             }
         }
         i--; j--;
         String s="";
         while(i>0 && j>0){
             if(str1.charAt(i-1)==str2.charAt(j-1)){
                 s=str1.charAt(i-1)+s; i--; j--;
             }
             else{
                 if(dp[i-1][j]>dp[i][j-1]){
                     s=str1.charAt(i-1)+s;
                     i--;
                 }
                 else { 
                    s=str2.charAt(j-1) + s; 
                    j--; 
                }
             }
         }
         if (i!=0){ s=str1.substring(0,i) + s; return s; }
        s=str2.substring(0,j) + s; 
        return s;
    }
}