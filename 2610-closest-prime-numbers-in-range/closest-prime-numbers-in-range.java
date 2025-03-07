class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean arr[]=new boolean[right+2];
        getPrime(arr,right+1);
        int res[]=new int[2];
        res[0]=-1; res[1]=-1;
        int pre=-1;
        for(int i=left;i<=right;i++){
            if(!arr[i]){
                if(pre==-1) pre=i;
                else {
                    if(res[1]==-1 || (res[1]-res[0]>i-pre)){
                        res[0]=pre;
                        res[1]=i;
                    } 
                    pre=i;
                }
            }
        }
        return res;
    }
    public static void getPrime(boolean arr[],int n){
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i*i<n;i++){
            if(!arr[i]){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;
                }
            }
        }
    }
}