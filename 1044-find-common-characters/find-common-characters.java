class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        int res[]=new int[26];
        for(int i=0;i<words[0].length();i++){
            res[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++){
            res=solve(res,words[i]);
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            while(res[i]--!=0){
                list.add(""+ch);
            }
        }
        return list;
    }
    public static int[] solve(int res[],String str){
        int t[]=new int[26];
        for(int i=0;i<str.length();i++){
            int in=str.charAt(i)-'a';
            t[in]=Math.min(res[in],++t[in]);
        }
        return t;
    }
}