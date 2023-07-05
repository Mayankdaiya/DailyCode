class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rmax[]=new int[grid.length];
        int cmax[]=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            int x=0, y=0;
            for(int j=0;j<grid.length;j++){
                x=Math.max(x,grid[i][j]);
            }
            for(int j=0;j<grid.length;j++){
                y=Math.max(y,grid[j][i]);
            }
            rmax[i]=x; cmax[i]=y;
        }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            int t=rmax[i];
            for(int j=0;j<grid.length;j++){
                if(t<=cmax[j]){
                    sum+=t-grid[i][j];
                } else sum+=cmax[j]-grid[i][j];
            }
        }
        return sum;
    }
}