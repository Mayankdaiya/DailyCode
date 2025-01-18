class Solution {
    public class Pair{
        int x, y, cost;
        Pair(int x,int y,int cost){
            this.x=x;
            this.y=y;
            this.cost=cost;
        }
    }
    public int minCost(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        if(n==m && n==1) return 0;
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
        boolean vis[][]=new boolean[n][m];
        vis[0][0]=true;
        if(grid[0][0]==1){
            if(m!=1) q.add(new Pair(0,1,0));
            if(n!=1) q.add(new Pair(1,0,1));
        } else if(grid[0][0]==3){
            if(n!=1) q.add(new Pair(1,0,0));
            if(m!=1) q.add(new Pair(0,1,1));
        } else {
            if(n!=1) q.add(new Pair(1,0,1));
            if(m!=1) q.add(new Pair(0,1,1));
        }
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.x, j=p.y, val=p.cost;
            if(i==n-1 && j==m-1) return val;
            if(vis[i][j]) continue;
            vis[i][j]=true;
            int c=grid[i][j];
            if(i+1<n && !vis[i+1][j]){
                Pair t=new Pair(i+1,j,val+1);
                if(c==3) t.cost-=1;
                q.add(t);
            }
            if(i-1>=0 && !vis[i-1][j]){
                Pair t=new Pair(i-1,j,val+1);
                if(c==4) t.cost-=1;
                q.add(t);
            }
            if(j+1<m && !vis[i][j+1]){
                Pair t=new Pair(i,j+1,val+1);
                if(c==1) t.cost-=1;
                q.add(t);
            } 
            if(j-1>=0 && !vis[i][j-1]){
                Pair t=new Pair(i,j-1,val+1);
                if(c==2) t.cost-=1;
                q.add(t);
            }
        }
        return -1;
    }
}