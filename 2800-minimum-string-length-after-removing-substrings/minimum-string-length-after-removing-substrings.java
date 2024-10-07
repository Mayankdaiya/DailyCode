class Solution {
    public int minLength(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()) stk.push(s.charAt(i));
            else if(s.charAt(i)=='B' && stk.peek()=='A') stk.pop();
            else if(s.charAt(i)=='D' && stk.peek()=='C') stk.pop();
            else stk.push(s.charAt(i));
        }
        int c=0;
        while(!stk.isEmpty()){
            c++;
            stk.pop();
        }
        return c;
    }
}