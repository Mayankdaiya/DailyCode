class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length, m=grid[0].length, res=0;
        if(n<3 || m<3) return 0;
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=m-3;j++){
                if(check(grid,i,j)) res++;
            }
        }
        return res;
    }
    public static boolean check(int grid[][],int r,int c){
        int sum=0, c1=c;
        int arr[]=new int[10];
        for(int i=r;i<r+3;i++){
            int s=0;
            for(int j=c;j<c+3;j++){
                int t=grid[i][j];
                if(t==0 || t>9 || arr[t]!=0) return false;
                s+=t; arr[t]++;
            }
            if(sum==0) sum=s;
            if(sum!=s) return false;
            s=0;
            for(int j=r;j<r+3;j++) s+=grid[j][c1];
            if(s!=sum) return false;
            c1++;
        }
        if((grid[r][c]+2*grid[r+1][c+1]+grid[r+2][c+2]+grid[r][c+2]+grid[r+2][c])!=2*sum) return false;
        return true;
    }
}