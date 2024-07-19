class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            int min=matrix[i][0], j2=0;
            for(int j=0;j<m;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j]; j2=j;
                }
            }
            for(int i1=0;i1<n;i1++){
                if(matrix[i][j2]<matrix[i1][j2]){
                    j2=-1;
                    break;
                }
            }
            if(j2!=-1) res.add(matrix[i][j2]);
        }
        return res;
    }
}