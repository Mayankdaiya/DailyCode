class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                stk.push(s.charAt(i));
            } else {
                if(!stk.isEmpty()) stk.pop();
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stk.isEmpty()){
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }
}