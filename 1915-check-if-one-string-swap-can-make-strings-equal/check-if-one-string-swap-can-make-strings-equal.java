class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int in=-1, c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(c==2) return false;
                if(in==-1) in=i;
                else if(s1.charAt(in)!=s2.charAt(i) || s1.charAt(i)!=s2.charAt(in)) return false;
                c++;
            }
        }
        return c%2==0;
    }
}