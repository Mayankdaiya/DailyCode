class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int rones[]=new int[n];
        int cones[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rones[i]+=grid[i][j];
                cones[j]+=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=2*rones[i]+2*cones[j]-n-m;
            }
        } 
        return grid;
    }
}