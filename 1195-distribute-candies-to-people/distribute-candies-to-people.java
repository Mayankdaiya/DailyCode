class Solution {
    public int[] distributeCandies(int candies, int n) {
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int t=i+1;
            while(t*(t+1)/2 <= candies){
                res[i]+=(t*(t+1)/2-t*(t-1)/2);
                t+=n;
            }
            if(t*(t-1)/2<candies) res[i]+=(candies-t*(t-1)/2);
        }
        return res;
    }
}