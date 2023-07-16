class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int freq[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            char ch1=words[i].charAt(0), ch2=words[i].charAt(words[i].length()-1);
            if(check(ch1,ch2)){
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
    public static boolean check(char ch1,char ch2){
        if((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')) return true;
        return false;
    }
}