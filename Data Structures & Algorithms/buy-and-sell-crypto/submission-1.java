class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxprofit = Integer.MIN_VALUE;


        for(int i=0; i<n; i++){
            int profit = prices[i] - min;
            maxprofit = Math.max(maxprofit, profit);
            min = Math.min(min, prices[i]);
        }

        return maxprofit;
    }
}
