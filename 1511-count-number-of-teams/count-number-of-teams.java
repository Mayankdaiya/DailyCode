class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length, res=0;
        int dp[]=new int[n];
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(rating[i]>rating[j]){
                    dp[i]++;
                    res+=dp[j];
                }
            }
        }
        dp=new int[n];
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(rating[i]<rating[j]){
                    dp[i]++;
                    res+=dp[j];
                }
            }
        }  
        return res;
    }
}