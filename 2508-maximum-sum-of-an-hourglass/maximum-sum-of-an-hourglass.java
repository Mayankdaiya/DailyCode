class Solution {
    public int maxSum(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            if(i==0 || i==grid.length-1) continue;
            for(int j=0;j<grid[0].length;j++){
                if(j==0 || j==grid[0].length-1){
                    continue;
                } else{
                    int t1=grid[i][j]+grid[i-1][j-1]+grid[i-1][j+1]+grid[i+1][j-1]+grid[i+1][j+1]+grid[i-1][j]+grid[i+1][j];
                    max=Math.max(max,t1);
                }
            }
        }
        return max;
    }
}