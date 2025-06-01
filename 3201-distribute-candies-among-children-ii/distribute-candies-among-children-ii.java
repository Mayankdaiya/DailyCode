class Solution {
    public long distributeCandies(int n, int limit) {
        return cal(n+2)-3*cal(n-limit+1)+3*cal(n-(limit+1)*2+2)-cal(n-3*(limit+1)+2);
    }
    public long cal(int x){
        return x<0?0:((long)x*(x-1)/2);
    }
}