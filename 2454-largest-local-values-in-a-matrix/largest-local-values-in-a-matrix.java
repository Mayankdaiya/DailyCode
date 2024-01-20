class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int res[][]=new int[n-3+1][n-3+1];
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=n-3;j++){
                int max=0;
                for(int k=j;k<j+3;k++){
                    max=Math.max(Math.max(max,grid[i][k]),Math.max(grid[i+1][k],grid[i+2][k]));
                }
                res[i][j]=max;
            }
        }
        return res;
    }
}