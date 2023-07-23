class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        for(int i=0;i<mat.length;i++){
            int arr[]=new int[mat[i].length]; 
            arr[0]=mat[i][0];
            for(int j=1;j<mat[i].length;j++){
                arr[j]=arr[j-1]+mat[i][j];
            }
            for(int j=0;j<mat[i].length;j++){
                int st=(j-k<0)?0:(j-k), en=(j+k<mat[i].length)?(j+k):mat[i].length-1;
                if(st==0) mat[i][j]=arr[en];
                else mat[i][j]=arr[en]-arr[st-1];
            }
        }
        for(int j=0;j<mat[0].length;j++){
            int arr[]=new int[mat.length]; 
            arr[0]=mat[0][j];
            for(int i=1;i<mat.length;i++){
                arr[i]=arr[i-1]+mat[i][j];
            }
            for(int i=0;i<mat.length;i++){
                int st=(i-k<0)?0:(i-k), en=(i+k<mat.length)?(i+k):mat.length-1;
                if(st==0) mat[i][j]=arr[en];
                else mat[i][j]=arr[en]-arr[st-1];
            }
        }
        return mat;
    }
}