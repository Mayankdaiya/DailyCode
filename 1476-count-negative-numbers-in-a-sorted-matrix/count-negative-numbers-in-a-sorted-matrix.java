class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length, m=grid[0].length, res=0;
        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(grid[i][j]<0) res++;
                else break;
            }
            if(grid[n-1][j]>0) break;
        }
        return res;
    }
}