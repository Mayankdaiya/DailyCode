class Solution {
    public String convertToTitle(int c) {
        StringBuilder str=new StringBuilder();
        while(c>0){
            int t=(c-1)%26;
            str.append((char)('A'+t));
            c=(c-1)/26;
        }
        str.reverse();
        return str.toString();
    }
}