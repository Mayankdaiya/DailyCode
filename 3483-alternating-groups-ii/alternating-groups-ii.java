class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i=0, j=1, n=colors.length, s=1, res=0;
        while(i<n){
            int in=j%n-1;
            if(in==-1) in=n-1;
            if(colors[j%n]==colors[in]){
                i=j;
                s=1;
            } else s++;
            if(s==k){
                s--;
                res++;
                i++;
            }
            j++;
        }
        return res;
    }
}