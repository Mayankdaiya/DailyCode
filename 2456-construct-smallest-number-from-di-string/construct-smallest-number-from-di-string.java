class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res=new StringBuilder("1");
        StringBuilder tmp=new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                res.append(tmp).append((char)('2'+i));
                tmp.setLength(0);
            } else {
                tmp.insert(0,res.charAt(res.length()-1));
                res.setLength(res.length()-1);
                res.append((char)('2'+i));
            }
        }
        return res.append(tmp).toString();
    }
}