class Solution {
    public int pivotInteger(int n) {
        double x=Math.pow((n*n+n)/2,(double)1/2);
        int y=(int)x;
        return x==y?y:-1;
    }
}