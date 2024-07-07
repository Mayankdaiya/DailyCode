class Solution {
    public long maximumPoints(int[] en, int cur) {
        Arrays.sort(en);
        long res=0;
        int i=0, j=en.length-1;
        while(i<=j){
            if(cur<en[i]) break;
            res+=(cur/en[i]);
            cur=cur%en[i];
            if((j==en.length-1 && res!=0) || j!=en.length-1){
                cur+=en[j]; j--;
            } else break;
        }
        return res;
    }
}