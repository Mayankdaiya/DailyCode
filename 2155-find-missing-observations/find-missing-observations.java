class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int res[]=new int[n];
        int rem=(n+rolls.length)*mean, in=1;
        for(int el:rolls) rem-=el;
        if(6*n<rem || rem<n) return new int[]{};
        for(int i=1;i<7;i++){
            if(i*n<=rem) in=i;
            else break;
        }
        rem-=in*(n-1);
        int t=rem-6, r=6-in;
        for(int i=0;i<n-1;i++){
            if(t<=0){
                res[i]=in;
            } else if(t-r>=0){
                res[i]=6;
                rem-=r; t-=r;
            } else if(t-r<0){
                res[i]=in+t;
                rem-=t; t=0;
            }
        }
        res[n-1]=rem;
        return res;
    }
}