class Solution {
    public String makeGood(String s) {
        StringBuilder res=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){ 
                st.push(s.charAt(i));
                continue;    
            }
            char ch1=Character.toLowerCase(s.charAt(i));
            char ch2=Character.toLowerCase(st.peek());
            if(ch1==ch2 && st.peek()!=s.charAt(i)){
                st.pop();
            } else st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }
        // res.append(s.charAt(s.length()-1));
        return res.toString();
    }
}