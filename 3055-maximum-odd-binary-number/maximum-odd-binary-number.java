class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0, n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') one++;
        }
        StringBuilder res=new StringBuilder();
        for(int i=1;i<one;i++) res.append('1');
        for(int i=0;i<(n-one);i++) res.append('0');
        res.append('1');
        return res.toString();
    }
}