class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int mat[][]=new int[m][n];
        int arr[][]=new int[m][n];
        for(int el[]: guards){
            mat[el[0]][el[1]]=1;
            arr[el[0]][el[1]]=1;
        }
        for(int el[]: walls){
            mat[el[0]][el[1]]=-1;
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j-1]!=-1 && mat[i][j]!=-1 && mat[i][j-1]>0){
                    mat[i][j]+=mat[i][j-1];
                } 
                if(mat[i][n-j]!=-1 && mat[i][n-j-1]!=-1 && mat[i][n-j]>0){
                    mat[i][n-j-1]+=mat[i][n-j];
                } 
            }
        }
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                if(mat[i-1][j]!=-1 && mat[i][j]!=-1 && mat[i-1][j]>0){
                    arr[i][j]+=arr[i-1][j];
                    mat[i][j]+=arr[i][j];
                }
                if(mat[m-i][j]!=-1 && mat[m-i-1][j]!=-1 && mat[m-i][j]>0){
                    arr[m-i-1][j]+=arr[m-i][j];
                    mat[m-i-1][j]+=arr[m-i][j];
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) count++;
            }
        }
        return count;
    }
}