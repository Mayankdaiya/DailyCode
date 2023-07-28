class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        List<String> list=new ArrayList<>();
        int maxlen=0;
        for(int i=0;i<dictionary.size();i++){
            String str=dictionary.get(i);
            int in=0, len=str.length();
            if(len>s.length()) continue;
            for(int j=0;j<s.length() && in<len;j++){
                if(s.charAt(j)==str.charAt(in)) in++;
            }
            if(in==len && maxlen<len){
                list.clear();
                list.add(str);
                maxlen=len;
            } else if(in==len && maxlen==len){
                list.add(str);
            }
        }
        if(list.isEmpty()) return "";
        Collections.sort(list);
        return list.get(0);
    }
}