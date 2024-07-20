class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length, m=colSum.length;
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            int sum=rowSum[i];
            for(int j=0;j<m;j++){
                if(sum<=colSum[j]){
                    colSum[j]-=sum;
                    mat[i][j]=sum;
                    sum=0;
                } else {
                    sum-=colSum[j];
                    mat[i][j]=colSum[j];
                    colSum[j]=0;
                }
            }
        }
        return mat;
    }
}