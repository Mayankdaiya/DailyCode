class Solution {
    public int[] countBits(int n) {
        int t=1;
        int ans[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i==t){
                ans[i]=1; t*=2;
            } else{
                ans[i]+=ans[i-t/2]+1;
            }
        }
        return ans;
    }
}