class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> cur=new ArrayList<>();
        int lenS = s.length();
        int dp[][]=new int[lenS][lenS];
        for(int i=0;i<lenS;i++){
            Arrays.fill(dp[i],-1);
        }
        explore(0, s, cur, result, lenS, dp);
        return result;
    }

    private void explore(int index, String s, List<String> curr, List<List<String>> result, int lenS, int [][]dp) {
        if (index >= lenS) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < lenS; ++i) {
            String subStr = s.substring(index, i + 1);
            if (isPalindrome(s,index,i,dp)) {
                curr.add(subStr);
                explore(i + 1, s, curr, result, lenS, dp);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s,int i, int j,int dp[][]) {
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(i>=j) dp[i][j]=1;
        else if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=isPalindrome(s,i+1,j-1,dp)?1:0;
        } else{
            dp[i][j]=0;
        }
        return dp[i][j]==1;
    }
}