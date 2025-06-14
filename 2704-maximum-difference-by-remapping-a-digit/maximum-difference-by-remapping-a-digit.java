class Solution {
    public int minMaxDifference(int num) {
        int max=0, min=0, vmax=-1, vmin=-1;
        Stack<Integer> stk=new Stack<>();
        while(num>0){
            stk.add(num%10);
            num/=10;
        }
        while(!stk.isEmpty()){
            int t=stk.pop();
            if(vmin==-1 && t<9){
                vmin=t;
            }
            if(vmax==-1 && t>0){
                vmax=t;
            }
            if(t==vmin) max=max*10+9;
            else max=max*10+t;
            if(t==vmax) min=min*10;
            else min=min*10+t;
        }
        return max-min;
    }
}