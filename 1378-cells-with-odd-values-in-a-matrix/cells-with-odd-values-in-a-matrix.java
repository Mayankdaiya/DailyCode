class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int in=0;in<indices.length;in++){
            int i=indices[in][0];
            for(int j=0;j<n;j++) arr[i][j]++;
            int j=indices[in][1];
            for(i=0;i<m;i++) arr[i][j]++;
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0) res++;
            }
        }
        return res;
    }
}