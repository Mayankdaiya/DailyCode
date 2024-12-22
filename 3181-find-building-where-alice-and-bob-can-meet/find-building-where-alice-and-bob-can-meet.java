class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int q=queries.length, n=heights.length;
        List<int[]>[] list=new List[n];
        for(int i=0;i<n;i++) list[i]=new ArrayList<>();
        int res[]=new int[q];
        Arrays.fill(res,-1);
        for(int i=0;i<q;i++){
            int alice=queries[i][0], bob=queries[i][1];
            if(alice>bob){
                int t=alice;
                alice=bob;
                bob=t;
            }
            if(alice==bob || heights[alice]<heights[bob]){
                res[i]=bob;
            } else list[bob].add(new int[]{heights[alice],i});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            while(!pq.isEmpty() && pq.peek()[0]<heights[i]){
                res[pq.remove()[1]]=i;
            }
            for(int tmp[]:list[i]){
                pq.add(tmp);
            }
        }
        return res;
    }
}