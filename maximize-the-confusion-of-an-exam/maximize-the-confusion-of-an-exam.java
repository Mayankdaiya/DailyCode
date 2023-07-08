class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int t1=getMaxCons(answerKey,k,'T');
        int t2=getMaxCons(answerKey,k,'F');
        return Math.max(t1,t2);
    }
    public static int getMaxCons(String str,int k,char ch){
        int in=0, win=k;
        int len=0, max=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                len++;
            } else{
                if(win>0){
                    win--; len++;
                } else{
                    int d=1;
                    while(in<str.length() && str.charAt(in)==ch){ 
                        in++; d++;
                    }
                    in++;
                    max=Math.max(max,len);
                    len=len+1-d;
                }
            }
        }
        max=Math.max(max,len);
        return max;
    }
}