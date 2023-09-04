class Solution {
    public int numberOfSubstrings(String s) {
        int ch[]=new int[3];
        int fi=s.length()-1;
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            if(ch[0]!=0 && ch[1]!=0 && ch[2]!=0){
                fi=i; 
                break;
            }
        }
        int count=0, in=0;
        while(ch[0]!=0 && ch[1]!=0 && ch[2]!=0 && fi<s.length()){
            count+=s.length()-fi;
            ch[s.charAt(in)-'a']--; in++;
            while(ch[0]!=0 && ch[1]!=0 && ch[2]!=0){
                count+=s.length()-fi;
                ch[s.charAt(in)-'a']--;
                in++;
            } 
            while((ch[0]==0 || ch[1]==0 || ch[2]==0) && ++fi<s.length()){
                ch[s.charAt(fi)-'a']++;
            }
        }
        return count;
    }
}