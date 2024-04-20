class Solution {
    public int[][] findFarmland(int[][] land) {
        int n=land.length, m=land[0].length;
        boolean visited[][]=new boolean[n][m];
        List<int[]> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && land[i][j]==1){
                    int ci=i, cj=j;
                    while(ci<n && land[ci][j]==1){
                        visited[ci][j]=true;
                        ci++;
                    }
                    while(cj<m && land[i][cj]==1){
                        cj++;
                    }
                    for(int k=i;k<ci;k++){
                        for(int l=j;l<cj;l++){
                            visited[k][l]=true;
                        }
                    }
                    res.add(new int[]{i,j,ci-1,cj-1});
                }
            }
        }
        int ans[][]=new int[res.size()][4];
        int in=0;
        for(int arr[]:res){
            ans[in++]=arr;
        }
        return ans;
    }
}