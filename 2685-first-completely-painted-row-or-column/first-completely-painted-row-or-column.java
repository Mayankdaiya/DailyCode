class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        int map[][]=new int[n*m][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=mat[i][j]-1;
                map[val][0]=i;
                map[val][1]=j;
            }
        }
        for(int i=0;i<arr.length;i++){
            int x=map[arr[i]-1][0], y=map[arr[i]-1][1];
            row[x]++; col[y]++;
            if(row[x]==m || col[y]==n) return i;
        }
        return n*m-1;
    }
}