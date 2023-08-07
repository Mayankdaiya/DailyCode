class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][n-1]<target) continue;
            int in=0, j=n-1;
            while(in<=j){
                int mid=in+(j-in)/2;
                if(matrix[i][mid]<target) in=mid+1;
                else if(matrix[i][mid]>target) j=mid-1;
                else return true;
            }
        }
        return false;
    }
}