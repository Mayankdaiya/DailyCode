class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int curr=Integer.MAX_VALUE, c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<=0){
                    curr=Math.min(curr,-matrix[i][j]);
                    sum-=matrix[i][j];
                    c++;
                } else{
                    sum+=matrix[i][j];
                    curr=Math.min(curr,matrix[i][j]);
                } 
            }
        }
        if(c%2==0) return sum;
        else return sum-2*curr;
    }
}