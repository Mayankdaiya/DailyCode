class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int arr[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            if(isVowel(words[i],words[i].length())) arr[i]=1;
            if(i>0) arr[i]+=arr[i-1];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<res.length;i++){
            int t=queries[i][0];
            if(t!=0) t=arr[t-1];
            res[i]=arr[queries[i][1]]-t;
        }
        return res;
    }
    public static boolean isVowel(String w,int n){
        char ch1=w.charAt(0), ch2=w.charAt(n-1);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u') return true;
        }
        return false;
    }
}