class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0, y=31;
        while(x<=y){
            int mid = x+(y-x)/2;
            long val = (long)Math.pow(2,mid);
            if(n>val) x=mid+1;
            else if(n<val) y=mid-1;
            else return true;
        }
        return false;
    }
}