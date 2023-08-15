class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int mat[][]=new int[n][n];
        for(int i=0;i<queries.length;i++){
            int r1=queries[i][0], c1=queries[i][1], r2=queries[i][2], c2=queries[i][3];
            mat[r1][c1]+=1; 
            if(c2+1<n) mat[r1][c2+1]+=-1; 
            if(r2+1<n){
                mat[r2+1][c1]+=-1;
                if(c2+1<n) mat[r2+1][c2+1]+=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++) mat[i][j]+=mat[i][j-1];
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++) mat[j][i]+=mat[j-1][i];
        }
        return mat;
    }
}