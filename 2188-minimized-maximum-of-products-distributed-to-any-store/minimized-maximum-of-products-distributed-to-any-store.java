class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int max=0;
        for(int i=0;i<q.length;i++){
            if(q[i]>max) max=q[i];
        }
        int i=1, j=max;
        while(i<j){
            int mid=i+(j-i)/2;
            if(check(q,mid,n)) j=mid-1;
            else i=mid+1;
        }
        if(check(q,i,n)) return i;
        else return i+1;
    }
    public static boolean check(int q[],int mx,int n){
        for(int i=0;i<q.length;i++){
            if(n==0) return false;
            if(q[i]<=mx) n--;
            else {
                int t=q[i]/mx;
                if(q[i]%mx!=0) t++;
                n-=t;
            }
        }
        return n>=0;
    }
}