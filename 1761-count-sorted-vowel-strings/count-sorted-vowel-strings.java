class Solution {
    public int countVowelStrings(int n) {
        int dp[][]=new int[n][5];
        for(int j=0;j<5;j++) dp[0][j]=5-j;
        for(int i=1;i<n;i++) dp[i][4]++;
        for(int i=1;i<n;i++){
            for(int j=3;j>=0;j--){
                dp[i][j]+=dp[i][j+1]+dp[i-1][j];
            }
        }
        return dp[n-1][0];
    }
}