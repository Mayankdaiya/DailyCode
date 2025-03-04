class Solution {
    public boolean checkPowersOfThree(int n) {
        Set<Integer> set=new HashSet<>();
        while(n>0){
            int t=1;
            while(t<=n){
                t*=3;
            }
            t/=3;
            if(set.contains(t)) return false;
            set.add(t);
            n-=t;
        }
        return n==0;
    }
}