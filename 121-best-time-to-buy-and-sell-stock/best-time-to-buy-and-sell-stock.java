class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0], maxpr=0;
        for(int i=1;i<prices.length;i++){
            maxpr=Math.max(maxpr,prices[i]-minp);
            minp=Math.min(minp,prices[i]);
        }
        return maxpr;
    }
}