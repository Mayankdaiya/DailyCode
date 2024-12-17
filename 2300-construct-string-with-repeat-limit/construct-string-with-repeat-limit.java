class Solution {
    public String repeatLimitedString(String s, int rl) {
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        int i=25;
        while(i>=0){
            if(ch[i]>0){
                int t=0, j=i-1;
                while(t++<ch[i]){
                    str.append((char)('a'+i));
                    if(t<ch[i] && t%rl==0){
                        while(j>=0 && ch[j]==0) j--;
                        if(j<0 || ch[j]==0) break;
                        str.append((char)('a'+j)); 
                        ch[j]--;
                    }
                }
            }
            i--;
        }
        return str.toString();
    }
}