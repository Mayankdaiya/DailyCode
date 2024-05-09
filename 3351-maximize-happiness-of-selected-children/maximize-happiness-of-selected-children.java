class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res=0;
        int in=happiness.length-1, c=0;
        while(k-->0){
            happiness[in]-=c;
            if(happiness[in]>0) res+=happiness[in];
            c++; in--;
        }
        return res;
    }
}