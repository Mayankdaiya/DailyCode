class Solution {
    public int countPermutations(int[] complexity) {
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]) return 0;
        }
        long res=1;
        int i=complexity.length-1, mod=1000000007;
        while(i>0){
            res=(res*i)%mod;
            i--;
        }
        return (int)res;
    }
}