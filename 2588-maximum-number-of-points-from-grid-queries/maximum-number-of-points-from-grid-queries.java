class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int n=grid.length, m=grid[0].length, len=queries.length;
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int res[]=new int[len];
        int vis[][]=new int[n][m];

        PriorityQueue<int[]> q=new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<int[]> sorted=new ArrayList<>();
        for(int i=0;i<len;i++){
            sorted.add(new int[]{queries[i],i});
        }
        sorted.sort(Comparator.comparingInt(a->a[0]));
        q.offer(new int[]{grid[0][0],0,0});
        vis[0][0]=1;
        int points=0;
        for(int qr[]:sorted){
            int val=qr[0], idx=qr[1];
            while(!q.isEmpty() && q.peek()[0]<val){
                int top[]=q.poll();
                int i=top[1], j=top[2];
                points++;
                for(int[] d:dir){
                    int t1=i+d[0], t2=j+d[1];
                    if(t1>=0 && t1<n && t2<m && t2>=0 && vis[t1][t2]==0){
                        q.offer(new int[]{grid[t1][t2],t1,t2});
                        vis[t1][t2]=1;
                    }
                }
            }
            res[idx]=points;
        }
        return res;
    }
}