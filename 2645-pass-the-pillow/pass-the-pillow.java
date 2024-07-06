class Solution {
    public int passThePillow(int n, int time) {
        int t=2*n-2;
        int res=time%t;
        if(res<=(n-1)){
            res++;
        } else{
            res-=n-1;
            res=n-res;
        }
        return res;
    }
}