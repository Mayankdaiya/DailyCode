class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> q=new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0]));
        for(int c[]:classes){
            double gain=(double)(c[0]+1)/(c[1]+1)-(double)c[0]/c[1];
            q.add(new double[]{gain,(double)c[0],(double)c[1]});
        }
        while(extraStudents-->0){
            double t[]=q.poll();
            double gain=(double)(t[1]+2)/(t[2]+2)-(double)(t[1]+1)/(t[2]+1);
            q.add(new double[]{gain,t[1]+1,t[2]+1});
        }
        double res=0;
        while(!q.isEmpty()){
            double t[]=q.poll();
            res+=((double)t[1]/t[2]);
        } 
        return (double)res/classes.length;
    }
}