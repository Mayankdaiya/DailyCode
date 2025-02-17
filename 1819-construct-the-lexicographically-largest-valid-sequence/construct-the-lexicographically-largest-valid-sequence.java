class Solution {
    public int[] constructDistancedSequence(int n) {
        int size=n*2-1;
        int res[]=new int[size];
        boolean used[]=new boolean[n+1];
        backtrack(res,used,n,0);
        return res;
    }
    public static boolean backtrack(int res[],boolean used[],int n,int in){
        if(in==2*n-1) return true;
        if(res[in]!=0) return backtrack(res,used,n,in+1);
        for(int i=n;i>=1;i--){
            if(used[i]) continue;
            used[i]=true;
            res[in]=i;
            if(i==1 && backtrack(res,used,n,in+1)) return true;
            if(i>1 && (in+i)<(2*n-1) && res[in+i]==0){
                res[in+i]=i;
                if(backtrack(res,used,n,in+1)) return true;
                res[in+i]=0;
            }
            used[i]=false;
            res[in]=0;
        }
        return false;
    }
}