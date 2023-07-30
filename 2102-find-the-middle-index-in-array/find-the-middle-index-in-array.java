class Solution {
    public int findMiddleIndex(int[] arr) {
        int n=arr.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=arr[0]; r[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            l[i]+=arr[i]+l[i-1];
            r[n-i-1]+=arr[n-i-1]+r[n-i];
        }
        for(int i=0;i<n;i++){
            if(l[i]==r[i]){
                return i;
            }
        }
        
        return -1;
    }
}
