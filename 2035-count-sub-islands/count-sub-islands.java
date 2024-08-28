class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int islands=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    if(!solve(grid1,grid2,i,j)){
                        islands++;
                    }
                }
            }
        }
        return islands;
    }
    public static boolean solve(int[][] grid1, int[][] grid2, int i, int j){
        if(i<0 || j<0 || i==grid1.length || j==grid1[0].length || grid2[i][j]==-1 || grid2[i][j]==0){
            return false;
        }
        boolean aa=false;
        if(grid2[i][j]!=grid1[i][j]) aa=true;
        grid2[i][j]=-1;
        boolean a=solve(grid1,grid2,i+1,j);
        boolean b=solve(grid1,grid2,i,j+1);
        boolean c=solve(grid1,grid2,i-1,j);
        boolean d=solve(grid1,grid2,i,j-1);
        return aa||a||b||c||d;
    }
}