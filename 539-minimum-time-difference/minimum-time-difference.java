class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int dif=Integer.MAX_VALUE;
        for(int i=1;i<=timePoints.size();i++){
            String s1=timePoints.get(i-1), s2=timePoints.get(i%timePoints.size());
            int h1=Integer.parseInt(s1.substring(0,2)), m1=Integer.parseInt(s1.substring(3));
            int h2=Integer.parseInt(s2.substring(0,2)), m2=Integer.parseInt(s2.substring(3));
            if(h1>h2) dif=Math.min(dif,getdif(h1,h2,m1,m2));
            else if(h1<h2) dif=Math.min(dif,getdif(h2,h1,m2,m1));
            else dif=Math.min(dif,Math.abs(m1-m2));
        }
        return dif;
    }
    public static int getdif(int h1,int h2,int m1,int m2){
        int dif=0;
        if(h1-h2>12){
            int t1=24-h1+h2-1, t2=60-m1+m2;
            dif=t1*60+t2;
        } else {
            int t1=h1-h2-1, t2=60-m2+m1;
            dif=t1*60+t2;
        }
        return dif;
    }
}