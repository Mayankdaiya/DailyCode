class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length, temp=1, k=3, res=0;
        for(int i=1;i<(n+k-1);i++){
            while(i<(n+k-1) && temp<k && colors[i%n]!=colors[(i-1)%n]){
                temp++; i++;
            }
            if(temp==k){
                res++; temp--; i--;
            } else if(i==(n+k-1)){
                break;
            } else {
                temp=1; 
            }
        }
        return res;
    }
}