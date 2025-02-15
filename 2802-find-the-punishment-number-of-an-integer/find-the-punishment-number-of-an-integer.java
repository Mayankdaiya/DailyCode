class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(punish(Integer.toString(i*i),i)){
                sum+=(i*i);
            }
        }
        return sum;
    }
    public static boolean punish(String str,int t){
        return backtrack(str,t,0,0);
    }
    public static boolean backtrack(String str,int t,int st,int cur){
        if(cur>t) return false;
        if(st==str.length()) return cur==t;
        for(int i=st+1;i<=str.length();i++){
            String part=str.substring(st,i);
            int p=Integer.parseInt(part);
            if(backtrack(str,t,i,cur+p)){
                return true;
            }
        }
        return false;
    }
}