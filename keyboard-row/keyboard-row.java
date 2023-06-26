class Solution {
    public String[] findWords(String[] words) {
        Set<Character> r1=new HashSet<>();
        Set<Character> r2=new HashSet<>();
        Set<Character> r3=new HashSet<>();
        String s="qwertyuiop";
        for(int i=0;i<s.length();i++) r1.add(s.charAt(i));
        s="asdfghjkl";
        for(int i=0;i<s.length();i++) r2.add(s.charAt(i));
        s="zxcvbnm";
        for(int i=0;i<s.length();i++) r3.add(s.charAt(i));
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i].toLowerCase();
            if(r1.contains(str.charAt(0))){ 
                if(check(str,r1)){
                    ans.add(words[i]);
                }
            }
            else if(r2.contains(str.charAt(0))){ 
                if(check(str,r2)){
                    ans.add(words[i]);
                }
            }
            else if(r3.contains(str.charAt(0))){ 
                if(check(str,r3)){
                    ans.add(words[i]);
                }
            }
        }
        String res[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++) res[i]=ans.get(i); 
        return res;
    }
    public static boolean check(String str,Set<Character> set){
        for(int j=1;j<str.length();j++){
            if(!set.contains(str.charAt(j))) return false;
        }
        return true;
    }
}