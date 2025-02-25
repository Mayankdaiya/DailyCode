class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int ev=0, od=0, c=0, mod=1000000007;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c=(c+od)%mod;
                ev++;
            } else {
                c=(c+1+ev)%mod;
                od++;
            }
        }
        return c;
    }
}