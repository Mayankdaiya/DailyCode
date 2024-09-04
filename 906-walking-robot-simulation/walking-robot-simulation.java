class Solution {
    public int robotSim(int[] com, int[][] ob) {
        int x=0, y=0, dir=1, res=0;
        for(int i=0;i<com.length;i++){
            int t=com[i], tx=x, ty=y;
            if(t>0){
                if(dir==1) ty+=t;
                else if(dir==3) ty-=t;
                else if(dir==2) tx+=t;
                else tx-=t; 
            } else {
                if(t==-2) dir--;
                else dir++;
                if(dir==0) dir=4;
                if(dir==5) dir=1;
                continue;
            }
            for(int j=0;j<ob.length;j++){
                if(tx==x && ob[j][0]==x){
                    int dif=ty-y;
                    if(dif>0 && ob[j][1]>y) ty=Math.min(ob[j][1]-1,ty);
                    else if(dif<0 && ob[j][1]<y) ty=Math.max(ob[j][1]+1,ty);
                } else if(ty==y && ob[j][1]==y){
                    int dif=tx-x;
                    if(dif>0 && ob[j][0]>x) tx=Math.min(ob[j][0]-1,tx);
                    else if(dif<0 && ob[j][0]<x) tx=Math.max(ob[j][0]+1,tx);
                }
            }
            x=tx; y=ty;
            res=Math.max(res,x*x+y*y);
        }
        return res;
    }
}