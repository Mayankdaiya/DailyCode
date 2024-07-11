class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stk=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!str.isEmpty()) stk.push(new StringBuilder(str));
                str.setLength(0);
                stk.push(new StringBuilder("("));
            } else if(s.charAt(i)==')'){
                str.reverse();
                if(stk.peek().toString().equals("(")) stk.pop();
                if(!stk.isEmpty() && !stk.peek().toString().equals("(")){
                    str=(stk.pop()).append(str);
                } 
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}