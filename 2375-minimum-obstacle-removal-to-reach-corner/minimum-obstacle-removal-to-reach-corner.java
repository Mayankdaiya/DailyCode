class Solution {
    public class Pair{
        int cost, x, y;
        Pair(int cost,int x,int y){
            this.cost=cost;
            this.x=x;
            this.y=y;
        }
    }
    public int minimumObstacles(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->{
            if(a.cost!=b.cost) return a.cost-b.cost;
            else if(a.x!=b.x) return a.x-b.x;
            else return a.y-b.y;
        });
        q.add(new Pair(0,0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int c=p.cost, x=p.x, y=p.y;
            visited[x][y]=true;
            if(x-1>=0 && !visited[x-1][y]){
                visited[x-1][y]=true;
                q.add(new Pair(c+grid[x-1][y],x-1,y));
            }
            if(y-1>=0 && !visited[x][y-1]){
                visited[x][y-1]=true;
                q.add(new Pair(c+grid[x][y-1],x,y-1));
            }
            if(x+1<n && !visited[x+1][y]){
                visited[x+1][y]=true;
                q.add(new Pair(c+grid[x+1][y],x+1,y));
                if(x+1==n-1 && y==m-1) return c+grid[x+1][y];
            }
            if(y+1<m && !visited[x][y+1]){
                visited[x][y+1]=true;
                q.add(new Pair(c+grid[x][y+1],x,y+1));
                if(x==n-1 && y+1==m-1) return c+grid[x][y+1];
            }
        }
        return 0;
    }
}