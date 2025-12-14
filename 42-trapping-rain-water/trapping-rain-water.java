class Solution {
    public int trap(int[] h) {
        int len=h.length;
        int a[]=new int[len];
        int b[]=new int[len];
        a[0]=h[0]; b[len-1]=h[len-1];
        for(int i=1;i<len;i++){
            a[i]=Math.max(a[i-1],h[i]);
            b[len-i-1]=Math.max(b[len-i],h[len-i-1]);
        }
        int res=0;
        for(int i=0;i<len;i++) res+=Math.min(a[i],b[i])-h[i];
        return res;
    }
}