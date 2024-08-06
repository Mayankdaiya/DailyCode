class Solution {
    public int minimumPushes(String word) {
        int ch[]=new int[26];
        for(int i=0;i<word.length();i++){
            ch[word.charAt(i)-'a']++;
        }
        Arrays.sort(ch);
        int res=0, c=0, add=1;
        for(int i=25;i>=0;i--){
            if(ch[i]==0) break;
            res+=(ch[i]*add);
            c++;
            if(c==8){
                c=0; add++;
            }
        }
        return res;
    }
}