class Solution {
    public int numberOfArrays(int[] dif, int lower, int upper) {
        int l=lower, u=lower, cur=lower;
        for(int i=0;i<dif.length;i++){
            cur+=dif[i];
            l=Math.min(cur,l);
            u=Math.max(cur,u);
        }
        u+=(lower-l);
        l+=(lower-l);
        if(u>upper || u<lower || l<lower || l>upper) return 0;
        return upper-u+1;
    }
}
