class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }
        StringBuilder cur=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch==' '){
                if(!cur.isEmpty()){
                    if(!res.isEmpty()) res.append(" ");
                    res.append(cur);
                }
                cur.setLength(0);
            }
            else {
                cur.append(sentence.charAt(i));
                if(set.contains(cur.toString())){
                    if(!res.isEmpty()) res.append(" ");
                    res.append(cur);
                    while(i<sentence.length() && sentence.charAt(i)!=' ') i++;
                    cur.setLength(0);
                }
            }
        }
        if(!cur.isEmpty()){
            if(!res.isEmpty()) res.append(" ");
            res.append(cur);
        }
        return res.toString();
    }
}