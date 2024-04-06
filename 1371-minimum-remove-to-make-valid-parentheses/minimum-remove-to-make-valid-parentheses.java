class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='(' && s.charAt(i)!=')') continue;
            if(st.isEmpty()){
                st.push(i);
            } else{
                if(s.charAt(i)=='(' && s.charAt(st.peek())==')') st.pop();
                else st.push(i);
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() || i!=st.peek()){
                res.append(s.charAt(i));
            } else st.pop();
        }
        return res.toString();
    }
}