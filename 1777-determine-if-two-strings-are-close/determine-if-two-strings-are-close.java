class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int ch1[]=new int[26];
        for(int i=0;i<word1.length();i++){
            ch1[word1.charAt(i)-'a']++;
        }
        int ch2[]=new int[26];
        for(int i=0;i<word2.length();i++){
            ch2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(!((ch1[i]==0 && ch2[i]==0) || (ch1[i]>0 && ch2[i]>0))) return false;
        }
        System.out.println("YES");
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(ch1[i],map.getOrDefault(ch1[i],0)+1);
            map.put(ch2[i],map.getOrDefault(ch2[i],0)-1);
            if(map.get(ch2[i])==0) map.remove(ch2[i]);
            if(map.getOrDefault(ch1[i],1)==0) map.remove(ch1[i]);
        }
        return map.isEmpty();
    }
}