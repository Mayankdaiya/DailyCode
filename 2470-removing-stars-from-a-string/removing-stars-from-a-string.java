class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()=='*' && s.charAt(i)!='*'){
                st.pop();
            } else st.push(s.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.toString();
    }
}