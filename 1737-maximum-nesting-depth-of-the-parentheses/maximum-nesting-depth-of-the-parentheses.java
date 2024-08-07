class Solution {
    public int maxDepth(String str) {
        Stack<Character> stack = new Stack();
        int max=0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i) == '(' ){
                stack.push('(');
                max= Math.max(max,stack.size());
            }
            else if(str.charAt(i) == ')'){
                stack.pop();
            }    
        }
        return max;  
    }
}