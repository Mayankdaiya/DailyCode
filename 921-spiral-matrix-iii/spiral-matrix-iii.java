class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int i=rStart, j=cStart, in=0, n=rows*cols;
        int res[][]=new int[n][2];
        int r1=i-1, r2=i+1, c1=j-1, c2=j+1;
        while(in<n){
            while(j<=c2){
                if(i<rows && j<cols && i>=0 && j>=0) res[in++]=new int[]{i,j};
                j++;
            }
            j=c2; i++; c2++;
            while(i<=r2){
                if(i<rows && j<cols && i>=0 && j>=0) res[in++]=new int[]{i,j};
                i++;
            }
            i=r2; j--; r2++;
            while(j>=c1){
                if(i<rows && j<cols && i>=0 && j>=0) res[in++]=new int[]{i,j};
                j--;
            }
            j=c1; i--; c1--;
            while(i>=r1){
                if(i<rows && j<cols && i>=0 && j>=0) res[in++]=new int[]{i,j};
                i--;
            }
            i=r1; j++; r1--;
        }
        return res;
    }
}