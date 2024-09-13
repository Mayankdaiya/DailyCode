class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for(int i=1;i<arr.length;i++){
            arr[i]^=arr[i-1];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0], en=queries[i][1];
            res[i]=arr[en];
            if(st!=0){
                res[i]^=arr[st-1];
            }
        }
        return res;
    }
}