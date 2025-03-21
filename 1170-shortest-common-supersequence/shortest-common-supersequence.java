class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int l1=str1.length(), l2=str2.length();
        int dp[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=l2;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                } else {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        StringBuilder seq=new StringBuilder();
        int row=l1, col=l2;
        while(row>0 && col>0){
            if(str1.charAt(row-1)==str2.charAt(col-1)){
                seq.append(str1.charAt(row-1));
                row--; col--;
            } else if(dp[row-1][col]<dp[row][col-1]){
                seq.append(str1.charAt(row-1));
                row--;
            } else {
                seq.append(str2.charAt(col-1));
                col--;
            }
        }
        while(row>0){
            seq.append(str1.charAt(row-1));
            row--;
        }
        while(col>0){
            seq.append(str2.charAt(col-1));
            col--;
        }
        return seq.reverse().toString();
    }
}