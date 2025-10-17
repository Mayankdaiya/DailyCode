class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!stk.isEmpty()) stk.pop();
            } else stk.push(s.charAt(i));
        }
        String res = "";
        while(!stk.isEmpty()){
            res = stk.pop() + res;
        }
        return res;
    }
}