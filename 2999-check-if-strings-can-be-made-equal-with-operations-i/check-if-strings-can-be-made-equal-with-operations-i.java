class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for(int i=0;i<4;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if( (i+2<4 && s1.charAt(i)!=s2.charAt(i+2)) || (i-2>=0 && s1.charAt(i)!=s2.charAt(i-2)) ) return false;
            }
        }
        return true;
    }
}