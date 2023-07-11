class Solution {
    public int minTimeToType(String word) {
        int in=0, sum=0;
        for(int i=0;i<word.length();i++){
            int t=word.charAt(i)-'a';
            int t1=0, t2=0;
            if(t>in){
                t1=t-in; t2=25-t+in+1;
            } else{
                t1=in-t; t2=25-in+t+1;
            }
            sum=sum+1+Math.min(t1,t2);
            in=t;
        }
        return sum;
    }
}