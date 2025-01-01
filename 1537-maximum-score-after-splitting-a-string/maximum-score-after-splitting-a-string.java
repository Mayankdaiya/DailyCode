class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int a1[]=new int[n];
        int a2[]=new int[n];
        if(s.charAt(0)=='0') a1[0]=1;
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='0') a1[i]++;
            a1[i]+=a1[i-1];
        }
        if(s.charAt(n-1)=='1') a2[n-1]=1;
        int res=a1[n-2]+a2[n-1];
        for(int i=n-2;i>0;i--){
            if(s.charAt(i)=='1') a2[i]++;
            a2[i]+=a2[i+1];
            res=Math.max(res,a1[i]+a2[i]);
        }
        res=Math.max(res,a1[0]+a2[1]);
        return res;
    }
}