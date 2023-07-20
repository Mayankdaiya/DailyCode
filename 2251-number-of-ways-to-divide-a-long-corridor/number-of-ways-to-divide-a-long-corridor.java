class Solution {
    public int numberOfWays(String corridor) {
        if(corridor.length()==1) return 0;
        int count=0;
        int st=0;
        for(st=0;st<corridor.length();st++){
            if(corridor.charAt(st)=='S') break;
        }
        int p=0, s=0, ts=0;
        int mod=(int)((1e9)+7);
        long ans=1;
        for(int i=st;i<corridor.length();i++){
            if(s==2 && corridor.charAt(i)=='P'){
                p++;
            }
            if(corridor.charAt(i)=='S'){
                if(s==2){
                    s=0;
                    ans*=(p+1); p=0;
                    ans%=mod;
                }
                s++; ts++;
            }
        }
        if(ts%2==1 || ts==0) return 0;
        return (int)ans%mod;
    }
}