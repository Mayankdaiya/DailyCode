class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length() && isBoth(words[i],words[j])){
                    res++;
                }
            }
        }
        return res;
    }
    public static boolean isBoth(String s1,String s2){
        int in=0, j=s2.length()-s1.length();
        while(in<s1.length() && s1.charAt(in)==s2.charAt(in) && s1.charAt(in)==s2.charAt(j)){
            in++; j++;
        }
        if(in==s1.length()) return true;
        return false;
    }
}