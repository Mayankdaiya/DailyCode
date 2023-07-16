class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int freq[]=new int[words.length];
        String c="aeiou";
        for(int i=0;i<words.length;i++){
            char ch1=words[i].charAt(0), ch2=words[i].charAt(words[i].length()-1);
            if(c.indexOf(ch1)!=-1 && c.indexOf(ch2)!=-1){
                freq[i]=1;
            }
            if(i!=0) freq[i]+=freq[i-1];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0], en=queries[i][1];
            if(st!=0) ans[i]=freq[en]-freq[st-1];
            else ans[i]=freq[en];
        }
        return ans;
    }
}