class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        int mc[][]=new int[n][m];
        for(int j=0;j<m;j++){
            mc[0][j]=matrix[0][j];
            for(int i=1;i<n;i++){
                mc[i][j]=matrix[i][j]+mc[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        int subMat=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int i1=i, j1=j;
                while(i1<n && j1<m){
                    if(i==0 && mc[i1][j1]!=i1+1) break;
                    if(j==0 && matrix[i1][j1]!=j1+1) break;
                    if(i!=0 && mc[i1][j1]-mc[i-1][j1]!=i1-i+1) break;
                    if(j!=0 && matrix[i1][j1]-matrix[i1][j-1]!=j1-j+1) break; 
                    subMat++; i1++; j1++;
                }
            }
        }
        return subMat;
    }
}