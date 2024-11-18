class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        if(k==0) return new int[n];
        int res[]=new int[n];
        int inc=k>0?1:-1, j=(n+inc)%n, curr=0;
        for(int i=0;i<Math.abs(k);i++){
            curr+=code[j];
            j=(j+inc)%n;
        }
        for(int i=0;i<n;i++){
            res[i]=curr;
            if(k>0){
                curr+=code[j];
                curr-=code[(i+1)%n];
                j=(j+1)%n;
            } else {
                curr+=code[i];
                curr-=code[++j%n];
            }
        }
        return res;
    }
}