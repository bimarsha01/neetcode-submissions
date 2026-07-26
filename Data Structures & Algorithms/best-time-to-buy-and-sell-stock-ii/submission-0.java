class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i] > prices[i+1]){
                continue;
            }
            else if(prices[i]< prices[i+1]){
                int res = prices[i+1] - prices[i];
                profit = profit + res;
            }
        }
        return profit;
    }
}