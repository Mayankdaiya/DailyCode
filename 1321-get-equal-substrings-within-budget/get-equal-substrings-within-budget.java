class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int res=0, length=0, cost=0, in=0;
        for(int i=0;i<s.length();i++){
            int d=Math.abs(s.charAt(i)-t.charAt(i));
            cost+=d; length++; 
            if(cost<=maxCost){                
                res=Math.max(res,length);
            }
            while(cost>maxCost){
                int diff=Math.abs(s.charAt(in)-t.charAt(in));
                cost-=diff; length--; in++;
            }
        }
        return res;
    }
}