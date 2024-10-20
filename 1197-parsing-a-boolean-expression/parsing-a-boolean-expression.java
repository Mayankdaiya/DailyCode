class Solution {
    public boolean parseBoolExpr(String str) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==',' || ch=='(') continue;
            else if(ch==')'){
                boolean hast=false, hasf=false;
                while(stk.peek()=='f' || stk.peek()=='t'){
                    char top=stk.pop();
                    if(top=='t') hast=true;
                    if(top=='f') hasf=true;
                }
                char op=stk.pop();
                if(op=='!') stk.push(hast?'f':'t');
                else if(op=='|') stk.push(hast?'t':'f');
                else if(op=='&') stk.push(hasf?'f':'t');
            } else stk.push(ch);
        }
        return stk.peek()=='t';
    }
}