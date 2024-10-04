class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, max = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--){
            if(max<prices[i]) max = prices[i];
            else maxProfit = Math.max(maxProfit,max-prices[i]);
        }
        return maxProfit;
    }
}