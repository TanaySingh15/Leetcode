class Solution {
    public int lastStoneWeightII(int[] stones) {
        return minimumDifference(stones);
    }

    public static int minimumDifference(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        boolean[][] dp= new boolean[nums.length+1][sum+1];
        bottomUp(nums,nums.length,sum,dp);
        boolean[] s=new boolean[sum+1];
        for(int j=0;j<=sum;j++){
            boolean status=false;
            for(int i=0;i<=nums.length;i++){
                status=status||dp[i][j];
            }
            s[j]=status;
        }
        return minimumSum(s);
    }

    static int minimumSum(boolean[] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]) {
                if(arr[arr.length-i-1]){
                    int diff = Math.abs((2*i)+1-arr.length);
                    minimum = Math.min(minimum,diff);
                }
            }
        }
        return minimum;
    }

    static void bottomUp(int[] nums, int n, int sum, boolean[][] dp){

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]<=j)
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
    }
}