class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(strs[0])));
        for(int i=1;i<strs.length;i++){
            int f=0;
            for(int j=0;j<list.size();j++){
                if(check(list.get(j).get(0),strs[i])){
                    list.get(j).add(strs[i]); f=1;
                    break;
                }
            }
            if(f==0){
                list.add(new ArrayList<>(Arrays.asList(strs[i])));
            }
        }  
        return list;      
    }
    public static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int ch[]=new int[26];
        for(int i=0;i<s1.length();i++){
            ch[s1.charAt(i)-'a']++;
            ch[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0) return false;
        }
        return true;
    }
}