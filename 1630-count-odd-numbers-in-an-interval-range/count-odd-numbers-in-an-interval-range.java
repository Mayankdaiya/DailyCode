class Solution {
    public int countOdds(int low, int high) {
        int c1 = high/2, c2 = low/2;
        if(high%2==1) c1++;
        return c1-c2;
    }
}