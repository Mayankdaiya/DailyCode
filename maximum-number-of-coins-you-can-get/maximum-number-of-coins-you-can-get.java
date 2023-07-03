class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int c=0, t=piles.length/3;
        for(int i=piles.length-2;i>=t;i-=2){
            c+=piles[i];
        }   
        return c;
    }
}