class Solution {
    public boolean checkValidString(String s) {
        int l=0, r=0;
        for(char ch:s.toCharArray()){
            l+=(ch=='(')?1:-1;
            r+=(ch!=')')?1:-1;
            if(r<0) return false;
            l=Math.max(l,0); 
        }
        return l==0;
    }
}