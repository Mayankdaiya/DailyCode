class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stk=new Stack<>();
        int res=0, a=0, b=0;
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){ 
                stk.push(s.charAt(i));
                if(s.charAt(i)=='a') a++;
                else if(s.charAt(i)=='b') b++;
                continue;
            }
            char ch=s.charAt(i);
            if(stk.peek()=='a' && ch=='b'){
                if(x>=y){ 
                    res+=x;
                    stk.pop(); a--;
                }
                else {
                    stk.push('b'); b++;
                }
            } else if(stk.peek()=='b' && ch=='a'){
                if(y>=x){ 
                    res+=y;
                    stk.pop(); b--;
                }
                else {
                    stk.push('a'); a++;
                }
            } else {
                if(ch=='a') a++;
                else if(ch=='b') b++;
                else {
                    res+=(Math.min(a,b)*Math.min(x,y));
                    a=0; b=0;
                }
                stk.push(ch);
            }
        }
        res+=(Math.min(a,b)*Math.min(x,y));
        return res;
    }
}