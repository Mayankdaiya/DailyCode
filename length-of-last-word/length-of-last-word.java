class Solution {
    public int lengthOfLastWord(String s) {
        int f=0;
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(f==1){
                    str="";
                    f=0;
                }
                str+=s.charAt(i);
            } else{
                f=1;
            }
        }
        return str.length();
    }
}