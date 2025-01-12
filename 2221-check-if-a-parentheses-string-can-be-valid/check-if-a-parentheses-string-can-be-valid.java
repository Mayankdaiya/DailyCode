class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2==1) return false;
        Stack<Integer> stk=new Stack<>();
        Stack<Integer> unlock=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0') unlock.push(i);
            else if(s.charAt(i)=='(') stk.push(i); 
            else if(s.charAt(i)==')'){
                if(!stk.isEmpty()) stk.pop();
                else if(!unlock.isEmpty()) unlock.pop();
                else return false;
            }
        }
        while(!stk.isEmpty() && !unlock.isEmpty() && stk.peek()<unlock.peek()){
            stk.pop();
            unlock.pop();
        }
        if(stk.isEmpty() && !unlock.isEmpty()) return unlock.size()%2==0;
        return stk.isEmpty();
    }
}