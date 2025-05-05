class Solution {
    public int numTilings(int n) {
        if(n<3) return n;
        int a=1, b=2, c=5, mod=1000000007;
        for(int i=3;i<n;i++){
            long t=((long)2*c+a)%mod;
            a=b; b=c; c=(int)t;
        }
        return c;
    }
}