class Solution {
    public int minBitFlips(int start, int goal) {
        int res=0;
        while(start!=0 || goal!=0){
            int t1=1&start, t2=1&goal;
            if(t1!=t2) res++;
            start=start>>1; goal=goal>>1;
        }
        return res;
    }
}