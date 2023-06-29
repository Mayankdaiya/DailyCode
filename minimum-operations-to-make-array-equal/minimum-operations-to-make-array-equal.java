class Solution {
    public int minOperations(int n) {
        int mid=n/2, ans=0;
        for(int i=0;i<mid;i++){
            int st=i*2+1, en=(n-i-1)*2+1;
            ans+=(st+en)/2-st;
        }
        return ans;
    }
}