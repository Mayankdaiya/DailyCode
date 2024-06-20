class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1, high=(position[n-1]-position[0])/(m-1);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkPossible(position,m-1,mid)){
                low=mid+1;
            } else high=mid-1;
        }
        return high;
    }
    public static boolean checkPossible(int p[], int m, int d){
        int pre=p[0];
        for(int i=1;i<p.length && m>0;i++){
            if(p[i]-pre>=d){
                pre=p[i];
                m--;
            }
        }
        return m==0;
    }
}