class Solution {
    public int minSteps(String s, String t) {
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        int res=0;
        for(int i=0;i<26;i++){
            if(ch[i]<0) res-=ch[i];
        }
        return res;
    }
}