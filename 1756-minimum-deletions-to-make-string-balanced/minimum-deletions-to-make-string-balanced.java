class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                c1++;
                st.pop();
            } else st.push(s.charAt(i));
        }
        int c2=0;
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()=='a' && s.charAt(i)=='b'){
                c2++;
                st.pop();
            } else st.push(s.charAt(i));
        }
        return Math.min(c1,c2);
    }
}