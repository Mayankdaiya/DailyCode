class Solution {
    public int nthUglyNumber(int n) {
        int arr[]=new int[n+1];
        arr[1]=1;
        int x=1, y=1, z=1;
        for(int i=2;i<=n;i++){
            arr[i]=Math.min(arr[x]*2,Math.min(arr[y]*3,arr[z]*5));
            if(arr[i]==arr[x]*2) x++;
            if(arr[i]==arr[y]*3) y++;
            if(arr[i]==arr[z]*5) z++;
        }
        return arr[n];
    }
}