class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int low=-1, high=0, n=bloomDay.length;
        for(int i=0;i<n;i++){
            if(high<bloomDay[i]) high=bloomDay[i];
        }
        while(low<high){
            int mid=low + (high-low)/2;
            if(isPossible(bloomDay, m, k, mid)) high=mid;
            else low=mid+1;
        }
        return low;
    }
    public static boolean isPossible(int arr[], int m,int k, int target){
        int t=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            while(i<arr.length && c<k && arr[i]<=target){
                c++; i++;
            }
            if(c==k){
                t++; i--;
            }
            if(t>=m) return true;
        }
        return false;
    }
}