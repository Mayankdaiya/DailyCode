class Solution {
    public int maximizeSquareArea(int m, int n, int[] h, int[] v) {
        Set<Integer> set=new HashSet<>();
        Arrays.sort(h);
        Arrays.sort(v);
        int range = Math.min(m,n)-1;
        int hl = h.length, vl=v.length;
        if(m-1==range) set.add(range);
        for(int i=0;i<hl;i++){
            set.add(h[i]-1);
            set.add(m-h[i]);
            for(int j=i+1;j<hl;j++){
                set.add(h[j]-h[i]);
            }
        }
        long res = 0, mod = 1000000007;
        if(n-1==range && set.contains(range)) return (int)(((long)range*range)%mod);
        for(int i=0;i<vl;i++){
            if(set.contains(v[i]-1)){
                long area = ((long)(v[i]-1)*(v[i]-1));
                res = Math.max(res,area);
            }
            if(set.contains(n-v[i])){
                long area = ((long)(n-v[i])*(n-v[i]));
                res = Math.max(res,area);                
            }
            for(int j=i+1;j<vl;j++){
                if(set.contains(v[j]-v[i])){
                    long area = ((long)(v[j]-v[i])*(v[j]-v[i]));
                    res = Math.max(res,area);    
                }
            }
        }
        return res==0?-1:(int)(res%mod);
    }
}