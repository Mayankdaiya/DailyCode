class Solution {
    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        int f[]=new int[10];
        for(int i=0;i<str.length();i++){
            f[str.charAt(i)-'0']++;
        }
        int res=0, in=-1;
        for(int i=0;i<str.length();i++){
            int j=9, t=0;
            while(in==-1 && j>=0){
                if(f[j]>0){
                    t=1;
                    res=res*10+j; f[j]--;
                    if((str.charAt(i)-'0')==j) break;
                    else in=i;
                }
                j--;
            }
            if(t!=1){
                if(f[str.charAt(i)-'0']>0){
                    res=res*10+(str.charAt(i)-'0');
                    f[str.charAt(i)-'0']--;
                } else res=res*10+(str.charAt(in)-'0');
            }
        }
        return res;
    }
}