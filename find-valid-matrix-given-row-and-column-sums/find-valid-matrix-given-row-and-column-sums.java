class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rl=rowSum.length;
        int cl=colSum.length;
        int arr[][]=new int[rl][cl];
        for(int i=0;i<rl;i++){
            int ros=rowSum[i];
            for(int j=cl-1;j>=0;j--){
                int cos=colSum[j];
                int min=Math.min(cos,ros);
                if(ros-min>=0){
                    arr[i][j]=min; ros-=min; colSum[j]-=min; rowSum[i]-=min;
                } 
            }
        }
        return arr;
    }
}