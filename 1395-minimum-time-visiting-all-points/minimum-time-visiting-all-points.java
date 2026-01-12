class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        for(int i=1;i<points.length;i++){
            int a1=points[i-1][0], b1=points[i-1][1];
            int a2=points[i][0], b2=points[i][1];
            int dx=Math.abs(a2-a1), dy=Math.abs(b2-b1);
            res+=(Math.max(dx,dy));
        }
        return res;
    }
}