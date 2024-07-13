class Solution {
    public class robot{
        int p, h, d, in;
        robot(int p,int h,int d, int in){
            this.p=p;
            this.h=h;
            this.d=d;
            this.in=in;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        robot obj[]=new robot[positions.length];
        for(int i=0;i<positions.length;i++){
            int t=directions.charAt(i)=='R'?1:0;
            obj[i]=new robot(positions[i],healths[i],t,i);
        }
        Arrays.sort(obj, (a, b) -> a.p - b.p);
        Stack<robot> stk=new Stack<>();
        for(int i=0;i<obj.length;i++){
            if(stk.isEmpty()) stk.push(obj[i]);
            else {
                check(stk,stk.peek(),obj[i]);
            }
        }
        List<robot> res=new ArrayList<>();
        while(!stk.isEmpty()){
            res.add(stk.pop());
        }
        Collections.sort(res,(a, b) -> a.in-b.in);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<res.size();i++) list.add(res.get(i).h);
        return list;
    }
    public static void check(Stack<robot> stk,robot pre, robot obj){
        if(pre.d-obj.d==1){
            if(pre.h-obj.h!=0){
                if(pre.h>obj.h){
                    pre.h--;
                    stk.pop();
                    if(!stk.isEmpty()) check(stk,stk.peek(),pre);
                    else stk.push(pre);
                } else {
                    obj.h--;
                    stk.pop();
                    if(!stk.isEmpty()) check(stk,stk.peek(),obj);
                    else stk.push(obj);
                }
            } else stk.pop();
        } else stk.push(obj);
        return;
    }
}