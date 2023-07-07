class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>max) max=costs[i];
        }
        int arr[]=new int[max+1];
        for(int i=0;i<costs.length;i++){
            arr[costs[i]]++;
        }
        int num=0;
        for(int i=0;i<=max;i++){
            if(arr[i]==0) continue;
            if(coins-i>=0){
                while(coins-i>=0 && arr[i]!=0){
                    coins-=i; arr[i]--; num++;
                }
            } else break;
        }
        return num;
    }
}