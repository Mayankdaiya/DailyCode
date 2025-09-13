class Solution {
    public int maxFreqSum(String s) {
        int ch[] = new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        int vov = 0 , cons = 0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                vov = Math.max(vov, ch[i]);
            } else cons = Math.max(cons, ch[i]);
        }
        return vov + cons;
    }
}