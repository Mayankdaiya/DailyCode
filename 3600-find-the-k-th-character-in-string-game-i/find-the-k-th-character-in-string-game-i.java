class Solution {
    public char kthCharacter(int k) {
        if(k==1) return 'a';
        return get(new StringBuilder("a"),k-1).charAt(0);
    }   
    public static String get(StringBuilder str,int k){
        if(str.length()>k) return ""+str.charAt(k);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='z') s.append((char)(str.charAt(i)+1));
            else s.append('a');
        }
        return get(str.append(s),k);
    }
}
