class Solution {
    public boolean halvesAreAlike(String s) {
        int f=1, c=0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()/2) f=-1;
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c+=f;
        }
        return c==0;
    }
}