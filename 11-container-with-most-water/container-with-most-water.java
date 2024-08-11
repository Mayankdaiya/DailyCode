class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=height[i];
            if(i!=0 && arr[i-1]>arr[i]) arr[i]=arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(height[i+1]>height[i]) height[i]=height[i+1];
        }
        int res=0, i=0, j=n-1;
        while(i<j){
            int t1=arr[i], t2=height[j];
            res=Math.max(res,Math.min(t1,t2)*(j-i));
            if(t1<t2) i++;
            else j--;
        }
        return res;
    }
}