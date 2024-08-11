class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length, res=0, i=0, j=n-1;
        while(i<j){
            if(i!=0){
                if(arr[i-1]>arr[i]) arr[i]=arr[i-1];
            }
            if(j!=n-1){
                if(arr[j+1]>arr[j]) arr[j]=arr[j+1];
            }
            int t1=arr[i], t2=arr[j];
            res=Math.max(res,Math.min(t1,t2)*(j-i));
            if(t1<t2) i++;
            else j--;
        }
        return res;
    }
}