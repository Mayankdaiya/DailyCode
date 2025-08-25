class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length, m=mat[0].length, el=m*n, i=0, j=0, in=0;
        int res[] = new int[el];
        while(in<el){
            res[in++]=mat[i][j];
            while(i-1>=0 && j+1<m){
                i--; j++;
                res[in++]=mat[i][j];
            } 
            if(j+1<m || i+1<n){
                if(j+1<m) j++;
                else i++;
                res[in++]=mat[i][j];
                while(i+1<n && j-1>=0){
                    i++; j--;
                    res[in++]=mat[i][j];
                }
            }
            if(i+1<n || j+1<m){
                if(i+1<n) i++;
                else j++;
            } 
        }
        return res;
    }
}