class Solution {
    public int minSwaps(String s) {
        int rem=s.length();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()) stk.push(s.charAt(i));
            else if(s.charAt(i)==']' && stk.peek()=='['){
                stk.pop(); rem-=2;
            } else stk.push(s.charAt(i));
        }
        rem/=2;
        if(rem%2==0) return rem/2;
        return rem/2+1;   
    }
}


