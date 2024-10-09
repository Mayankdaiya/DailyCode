class Solution {
    public int minAddToMakeValid(String s) {
        int s1=0, s2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') s1++;
            else if(s1>0) s1--;
            else s2++;
        }
        return s1+s2;
    }
}