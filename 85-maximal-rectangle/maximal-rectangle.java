class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxarea=0, n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            maxarea=Math.max(maxarea,matrix[i][0]-'0');
            for(int j=1;j<m;j++){
                if(matrix[i][j]=='1'){
                    matrix[i][j]=(char)(matrix[i][j]+(int)(matrix[i][j-1]-'0'));
                }
                // System.out.print(matrix[i][j]+" ");
                maxarea=Math.max(maxarea,matrix[i][j]-'0');
            }
            // System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='0') continue;
                int min=matrix[i][j]-'0', l1=i-1, l2=i+1;
                while(l1>=0 && (matrix[l1][j]-'0')>=min){
                    if(min==1 && maxarea>=n) break;
                    // min=Math.min(min,matrix[l1][j]-'0');
                    l1--;
                }
                while(l2<n && (matrix[l2][j]-'0')>=min){
                    if(min==1 && maxarea==n) break;
                    // min=Math.min(min,matrix[l2][j]-'0');
                    l2++;
                }
                maxarea=Math.max(maxarea,(l2-l1-1)*min);
            }
        }
        return maxarea;
    }
}