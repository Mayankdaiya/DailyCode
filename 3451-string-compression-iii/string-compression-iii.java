class Solution {
    public String compressedString(String word) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int in=i, c=0;
            while(in<word.length() && ch==word.charAt(in) && c<9){
                in++; c++;
            }
            str.append(c+""+ch);
            i=in-1;
        }   
        return str.toString();
    }
}