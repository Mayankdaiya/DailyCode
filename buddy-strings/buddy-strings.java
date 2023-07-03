class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int in1=-1, in2=-1, freq=0;
        int arr[]=new int[26];
        for(int i=0;i<goal.length();i++){
            arr[s.charAt(i)-'a']++;
            freq=Math.max(freq,arr[s.charAt(i)-'a']);
            if(s.charAt(i)!=goal.charAt(i)){
                if(in1==-1) in1=i;
                else if(in2==-1) in2=i;
                else return false;
            } 
        }
        if(s.equals(goal) && freq>=2) return true;
        if(in1==-1 || in2==-1) return false;
        if(s.charAt(in1)==goal.charAt(in2) && s.charAt(in2)==goal.charAt(in1)) return true;

        return false;
    }
}