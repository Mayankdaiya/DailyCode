class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int reach=0, i=0, added=0;
        while(reach<target){
            if(i<coins.length && coins[i]<=reach+1){
                reach += coins[i];
                i++;
            } else{
                reach += reach+1;
                added++;
            }
        }
        return added;
    }
}