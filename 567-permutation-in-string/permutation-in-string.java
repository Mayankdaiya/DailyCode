class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        int in=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(arr[ch-'a']==0){
                while(in<i && arr[ch-'a']==0){
                    arr[s2.charAt(in)-'a']++; 
                    in++;
                }
                if(arr[ch-'a']==0) in=i+1;
                else arr[ch-'a']--;
            } else {
                arr[ch-'a']--;
                if(i-in+1==s1.length()) return true;
            } 
        }
        return false;
    }
}