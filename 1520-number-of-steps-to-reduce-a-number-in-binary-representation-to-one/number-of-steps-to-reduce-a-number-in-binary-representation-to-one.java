class Solution {
    public int numSteps(String str) {
        char s[]=str.toCharArray();
        int j=s.length-1, steps=0, f=0;
        while(j!=0){
            if(s[j]=='1'){
                int t=j;
                while(t>=0 && s[t]=='1'){
                    s[t]='0';
                    t--;
                }
                if(t>=0) s[t]='1';
                else f=1;
                steps++;
            }
            else {
                steps++;
                j--;
            }
        }
        if(f==1 && s[0]=='0') steps++;
        else if(f==1 && s[0]=='1') steps+=3;
        return steps;
    }
}