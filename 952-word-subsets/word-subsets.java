class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int freq[]=new int[26];
        for(int i=0;i<words2.length;i++){
            String s=words2[i];
            int map[]=new int[26];
            for(int j=0;j<s.length();j++){
                map[s.charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++){
                freq[j]=Math.max(freq[j],map[j]);
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            String s=words1[i];
            int map[]=new int[26];
            for(int j=0;j<s.length();j++){
                map[s.charAt(j)-'a']++;
            }
            int f=0;
            for(int j=0;j<26;j++){
                if(freq[j]!=0 && map[j]<freq[j]){
                    f=1;
                    break;
                }
            }
            if(f==0) list.add(s);
        }
        return list;
    }
}