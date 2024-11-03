class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()) return false;
        for(int i=0;i<s.length();i++){
            int in=i, j=0;
            while(j<goal.length() && s.charAt(in%s.length())==goal.charAt(j)){
                in++; j++;
            }
            if(j==goal.length()) return true;
        }
        return false;
    }
}