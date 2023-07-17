class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length, m=queries.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int x=0, y=n-1, len=0;
            while(x<=y){
                int mid=x+(y-x)/2;
                if(nums[mid]<=queries[i]){
                    len=Math.max(len,mid+1);
                    x=mid+1;
                } else{
                    y=mid-1;
                }
            }
            ans[i]=len;
        }
        return ans;
    }
}