class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length, m=isWater[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1) isWater[i][j]=0;
                else isWater[i][j]=-1;
            }
        }
        int t=0;
        while(true){
            if(change(isWater,t)){
                t++;
            } else break;
        }
        return isWater;
    }
    public static boolean change(int mat[][],int t){
        int n=mat.length, m=mat[0].length, f=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==t){
                    if(i+1<n && mat[i+1][j]==-1) mat[i+1][j]=t+1;
                    if(j+1<m && mat[i][j+1]==-1) mat[i][j+1]=t+1;
                    if(i-1>=0 && mat[i-1][j]==-1) mat[i-1][j]=t+1;
                    if(j-1>=0 && mat[i][j-1]==-1) mat[i][j-1]=t+1;
                    f=1;
                }
            }
        }
        return f==1;
    }

}