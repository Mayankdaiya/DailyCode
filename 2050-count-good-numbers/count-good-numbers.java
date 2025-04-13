class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        return (int)((solve(5,(n+1)/2)*solve(4,n/2))%mod);
    }
    public long solve(int x,long y){
        long res=1, cal=x;
        while(y>0){
            if(y%2==1) res=(res*cal)%mod;
            cal=(cal*cal)%mod;
            y/=2;
        }
        return res;
    }
}


