class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals("-1")) continue;
            List<String> list=new ArrayList<>();
            list.add(str[i]);
            for(int j=i+1;j<str.length;j++){
                if(str[j].equals("-1") || str[j].length()!=str[i].length()) continue;
                int ch[]=new int[26];
                for(int k=0;k<str[j].length();k++){
                    ch[str[j].charAt(k)-'a']++;
                    ch[str[i].charAt(k)-'a']--;
                }
                int f=0;
                for(int k=0;k<26;k++){
                    if(ch[k]!=0){
                        f=1;
                        break;
                    }
                }
                if(f==0){ 
                    list.add(str[j]);
                    str[j]="-1";
                }
            }
            res.add(list);
        }
        return res;
    }
}