class Solution {
    public String customSortString(String order, String s) {
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<order.length();i++){
            int in=order.charAt(i)-'a';
            while(ch[in]-->0) str.append(order.charAt(i));
        }
        for(int i=0;i<26;i++){
            while(ch[i]-->0) str.append((char)('a'+i));
        }
        return str.toString();
    }
}