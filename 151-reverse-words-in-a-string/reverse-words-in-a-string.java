class Solution {
    public String reverseWords(String s) {
        String words[] = s.replaceAll("\\s+"," ").trim().split(" ");
        StringBuilder res = new StringBuilder(words[words.length-1]);
        for(int i=words.length-2;i>=0;i--){
            res.append(" "+words[i]);
        }
        return res.toString();
    }
}