class Solution {
    public int findLucky(int[] arr) {
        int f[]=new int[501];
        int mx=0;
        for(int i=0;i<arr.length;i++){
            f[arr[i]]++;
            if(arr[i]>mx) mx=arr[i];
        }
        int res=-1;
        for(int i=1;i<=mx;i++){
            if(f[i]==i) res=i;
        }
        return res;
    }
}