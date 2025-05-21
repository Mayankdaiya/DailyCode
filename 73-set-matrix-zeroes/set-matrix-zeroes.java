class Solution {
    public void setZeroes(int[][] matrix) {
        List<int []> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) list.add(new int[]{i,j});
            }
        }
        for(int a[]:list){
            for(int i=0;i<matrix[a[0]].length;i++){
                matrix[a[0]][i]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][a[1]]=0;
            }
        }
    }
}