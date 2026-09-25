class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]>prices[j-1]){
                max_profit+=(prices[j]-prices[j-1]);
            }
        }
        return max_profit;
    }
}