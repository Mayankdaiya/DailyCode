class Solution {
    public int minLength(String s) {
        Stack<Character> stk=new Stack<>();
        int c=s.length();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()) stk.push(s.charAt(i));
            else if(s.charAt(i)=='B' && stk.peek()=='A'){
                stk.pop(); c-=2;
            } else if(s.charAt(i)=='D' && stk.peek()=='C'){
                stk.pop(); c-=2;
            } else stk.push(s.charAt(i));
        }
        return c;
    }
}