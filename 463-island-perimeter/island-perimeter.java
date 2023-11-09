class Solution {
    public int islandPerimeter(int[][] grid) {
        int p=0, l1=grid.length, l2=grid[0].length;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(grid[i][j]==0) continue;
                if(i==0 || (i-1>=0 && grid[i-1][j]==0)) p++;  //top
                if(i==l1-1 || (i+1<l1 && grid[i+1][j]==0)) p++;  //bottom  
                if(j==0 || (j-1>=0 && grid[i][j-1]==0)) p++;  //left
                if(j==l2-1 || (j+1<l2 && grid[i][j+1]==0)) p++;  //right
            }
        }
        return p;
    }
}