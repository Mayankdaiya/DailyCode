class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int t=matrix[i-1][j];
                if(j==0){
                    matrix[i][j]+=Math.min(t,matrix[i-1][j+1]);
                } else if(j==matrix[i].length-1){
                    matrix[i][j]+=Math.min(t,matrix[i-1][j-1]);
                } else{
                    matrix[i][j]+=Math.min(t,Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
                }
            }
        }
        int res=Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++){
            res=Math.min(matrix[matrix.length-1][j],res);
        }
        return res;
    }
}