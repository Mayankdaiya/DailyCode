class Solution {
    public int pivotInteger(int n) {
        int i=1, j=n;
        int ls=0, rs=0;
        while(i<j){
            if(ls<=rs){
                ls+=i++;
            } else rs+=j--;
        }
        return ls==rs?i:-1;
    }
}