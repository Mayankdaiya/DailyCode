class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='(') {
                stk.push(s.charAt(i));
                res.append('(');
            } else if(!stk.isEmpty() && stk.peek()=='('){
                stk.pop();
                res.append(s.charAt(i));
            } else {
                i++;
            }
        }
        return res.toString();
    }
}