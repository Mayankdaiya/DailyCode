class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        for(int j=0;j<m;j++){
            int c=0;
            for(int i=0;i<n;i++){
                if(grid[i][j]==1) c++;
            }
            if(grid[n-1][j]==1) grid[n-1][j]=-c;
            else grid[n-1][j]=c;
        }
        int servers=0;
        for(int i=0;i<n;i++){
            int c=0, r=0;
            for(int j=0;j<m;j++){
                if(i==n-1){
                    if(grid[i][j]<0){
                        if(c>1) servers++;
                        else if(-grid[i][j]>1) servers++;
                        else r++;
                        c++;
                    }
                } else if(grid[i][j]==1){
                    if(c>1) servers++;
                    else if(Math.abs(grid[n-1][j])>1) servers++;
                    else r++;
                    c++;
                }
            }
            if(c>1) servers+=r;
        }
        return servers;
    }
}