class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        for(int i=happiness.length-1;i>=0 && k>0;i--){
            int t = (happiness[i] - (happiness.length-i-1)); 
            if(t<=0) break;
            res += t;
            k--;
        }
        return res;
    }
}