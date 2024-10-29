class Solution {
    public int maxMoves(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++) dp[i][0]=1;
        int res=0;
        for(int j=0;j<m-1;j++){
            int f=0;
            if(dp[0][j]!=0){
                f=1;
                if(grid[0][j]<grid[0][j+1]) dp[0][j+1]=1;
                if(grid[0][j]<grid[1][j+1]) dp[1][j+1]=1;
            }
            for(int i=1;i<n-1;i++){
                if(dp[i][j]==0) continue;
                else f=1;
                if(grid[i][j]<grid[i-1][j+1]) dp[i-1][j+1]=1;
                if(grid[i][j]<grid[i][j+1]) dp[i][j+1]=1;
                if(grid[i][j]<grid[i+1][j+1]) dp[i+1][j+1]=1;
            }
            if(dp[n-1][j]!=0){
                f=1;
                if(grid[n-1][j]<grid[n-1][j+1]) dp[n-1][j+1]=1;
                if(grid[n-1][j]<grid[n-2][j+1]) dp[n-2][j+1]=1;
            }
            if(f==0) break;
            res=j;
        }
        for(int i=0;i<n;i++){
            if(dp[i][m-1]!=0){
                res=m-1;
                break;
            }
        }
        return res;
    }
}