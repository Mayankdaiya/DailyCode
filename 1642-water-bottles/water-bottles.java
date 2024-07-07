class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles, i=numBottles;
        while(i>=numExchange){
            int t=i%numExchange;
            res+=(i/numExchange);
            i=t+(i/numExchange);
        }   
        return res;
    }
}