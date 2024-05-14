class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length, m=grid[0].length, res=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res=Math.max(res,solve(grid,vis,i,j,n,m));
            }
        }
        return res;
    }
    public static int solve(int[][] grid, int vis[][], int i, int j, int n, int m){
        if(i==n || i<0 || j<0 || j==m || vis[i][j]==1 || grid[i][j]==0){    
            return 0;
        }
        vis[i][j]=1;
        int t1=grid[i][j] + solve(grid,vis,i,j+1,n,m);
        int t2=grid[i][j] + solve(grid,vis,i+1,j,n,m);
        int t3=grid[i][j] + solve(grid,vis,i-1,j,n,m);
        int t4=grid[i][j] + solve(grid,vis,i,j-1,n,m);
        vis[i][j]=0;
        return Math.max(t1,Math.max(t2,Math.max(t3,t4)));
    }
}