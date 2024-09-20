class Solution {
    public String shortestPalindrome(String s) {
        String str="";
        int in=0, f=0, n=s.length();
        for(int i=0;i<n;i++){
            if(s.substring(i).startsWith(str)){
                in=i; f=0;
            }
            str=s.charAt(i)+str;
            if(s.substring(i).startsWith(str)){
                in=i; f=1;
            }
        }
        if(f==0) in--;
        in=in*2+1;
        if(f==0) in++;
        str=s;
        for(int i=in;i<n;i++){
            str=s.charAt(i)+str;
        }
        return str;
    }
}