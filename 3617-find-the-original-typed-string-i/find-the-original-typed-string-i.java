class Solution {
    public int possibleStringCount(String word) {
        int res=1, cur=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)) cur++;
            else {
                res+=(cur-1);
                cur=1;
            }
        }
        return res+(cur-1);
    }
}