class Solution {
    public String freqAlphabets(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.length()>i+2 && s.charAt(i+2)=='#'){
                int ch=s.charAt(i)-'0';
                ch*=10;
                ch+=s.charAt(i+1)-'0';
                ch+=96;
                ans+=(char)ch;
                i+=2;
            }
            else{
                int ch=s.charAt(i)-'0';
                ch+=96;
                ans+=(char)ch;
            }
        }
        return ans;
    }
}