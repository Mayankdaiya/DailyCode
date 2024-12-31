class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days[days.length-1];
        int dp[]=new int[n+1];
        int in=0;
        for(int i=1;i<=n && in<days.length;i++){
            if(days[in]==i){
                int t=dp[i-1]+costs[0], t1=costs[1], t2=costs[2];
                if(i-7>=0) t1+=dp[i-7];
                if(i-30>=0) t2+=dp[i-30];
                dp[i]=Math.min(t,Math.min(t1,t2));
                in++;
            } else dp[i]+=dp[i-1];
        }
        return dp[dp.length-1];
    }
}