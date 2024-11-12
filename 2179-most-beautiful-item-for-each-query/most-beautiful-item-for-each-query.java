class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a,b)-> a[0]-b[0]);
        for(int i=1;i<items.length;i++){
            items[i][1]=Math.max(items[i][1],items[i-1][1]);
            if(items[i-1][0]==items[i][0]) items[i-1][1]=items[i][1];
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i]>=items[items.length-1][0]){
                queries[i]=items[items.length-1][1];
                continue;
            } else if(queries[i]<items[0][0]){
                queries[i]=0;
                continue;
            }
            int in=0, j=items.length-1, tar=queries[i];
            while(in<j){
                int mid=in+(j-in)/2;
                if(tar>items[mid][0]) in=mid+1;
                else if(tar<items[mid][0]) j=mid-1;
                else {
                    in=mid;
                    break;
                }
            }
            while(tar<items[in][0]) in--;
            queries[i]=items[in][1];
        }
        return queries;
    }
}