class Solution {
    public int minSteps(int n) {
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            int t=i/2;
            if(i%2==0){
                arr[i]=arr[t]+2;
            } else {
                while(t>=1){
                    if(i%t==0){
                        arr[i]=arr[t]+(i/t);
                        break;
                    } else t--;
                }
            }
        }
        return arr[n];
    }
}