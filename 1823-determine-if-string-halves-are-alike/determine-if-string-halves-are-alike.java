class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0, c2=0;
        for(int i=0;i<s.length()/2;i++){
            char ch1=Character.toLowerCase(s.charAt(i));
            char ch2=Character.toLowerCase(s.charAt(s.length()-i-1));
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') c1++;
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u') c2++;
        }
        return c1==c2;
    }
}