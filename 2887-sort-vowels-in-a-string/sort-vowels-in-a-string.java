class Solution {
    public String sortVowels(String s) {
        char str[]=new char[s.length()];
        int arr[]=new int[10];
        for(int i=0;i<s.length();i++){
            int t=isVowel(s.charAt(i));
            if(t!=-1){ 
                arr[t]++; str[i]='0';
            } else{
                str[i]=s.charAt(i);
            }
        }
        String ans="";
        int in=0;
        for(int i=0;i<str.length;i++){
            while(in<10 && arr[in]==0) in++;
            if(str[i]=='0'){
                ans+=getVowel(in);
                arr[in]--;
            } else ans+=str[i];
        }
        return ans;    
    }
    public static int isVowel(char ch){
        switch(ch){
            case 'A': return 0;
            case 'E': return 1;
            case 'I': return 2;
            case 'O': return 3;
            case 'U': return 4;
            case 'a': return 5;
            case 'e': return 6;
            case 'i': return 7;
            case 'o': return 8;
            case 'u': return 9;
            default : return -1;
        }
    }
    public static char getVowel(int n){
        switch(n){
            case 0: return 'A';
            case 1: return 'E';
            case 2: return 'I';
            case 3: return 'O';
            case 4: return 'U';
            case 5: return 'a';
            case 6: return 'e';
            case 7: return 'i';
            case 8: return 'o';
            case 9: return 'u';
            default : return 'u';
        }
    }
}