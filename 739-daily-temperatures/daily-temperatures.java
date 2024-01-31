class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[t.length];
        for(int i=0;i<t.length;i++){
            if(st.isEmpty() || t[i]<t[st.peek()]){
                st.push(i);
            }
            else {
                while(!st.isEmpty() && t[i]>t[st.peek()]){
                    res[st.peek()]=i-st.pop();
                }
                st.push(i);
            }
        }
        return res;
    }
}