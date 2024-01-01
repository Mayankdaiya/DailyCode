class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        int n=g.length, m=s.length;
        Arrays.sort(g); Arrays.sort(s);
        int childs=0, i=0, j=0;
        while(i<n && j<m){
            if(s[j]>=g[i]){
                childs++;
                i++; j++;
            } else{
                j++;
            }
        }
        return childs;
    }
}