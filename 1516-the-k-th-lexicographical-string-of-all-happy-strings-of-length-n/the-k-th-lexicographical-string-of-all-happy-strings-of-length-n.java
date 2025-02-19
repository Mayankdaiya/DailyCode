class Solution {
    public String getHappyString(int n, int k) {
        int mx=3;
        for(int i=1;i<n;i++){
            mx*=2;
        }
        if(mx<k) return "";
        int cur=0, rem=mx/3;
        char a1, a2;
        String res="";
        if(rem>=k){
            res+='a';
            a1='b'; a2='c';
        } else if(2*rem>=k){
            res+='b'; cur=rem;
            a1='a'; a2='c';
        } else {
            res+='c'; cur=2*rem;
            a1='a'; a2='b';
        }
        rem/=2;
        while(n-->1){
            cur+=rem;
            char ch;
            if(k<=cur){
                res+=a1;
                cur-=rem;
                rem/=2; ch=a1;
            } else {
                res+=a2;
                rem/=2; ch=a2;
            }
            if(ch=='a'){
                a1='b'; a2='c';
            } else if(ch=='b'){
                a1='a'; a2='c';
            } else {
                a1='a'; a2='b';
            }
        }
        return res;
    }
}
