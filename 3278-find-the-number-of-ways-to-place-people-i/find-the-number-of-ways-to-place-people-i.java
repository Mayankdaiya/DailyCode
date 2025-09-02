class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            else return b[1]-a[1];
        });
        int res=0;
        for(int i=0;i<points.length;i++){
            int t=points[i][1], b=Integer.MIN_VALUE;
            for(int j=i+1;j<points.length;j++){
                int y=points[j][1];
                if(b<y && y<=t){
                    res++;
                    b=y;
                    if(b==t) break;
                }
            }
        }
        return res;
    }
}