class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(n<nums[i]) n=nums[i];
        }
        boolean arr[]=new boolean[n];
        arr[0]=true; 
        if(1<n) arr[1]=true;
        for(int i=2;i*i<n;i++){
            if(!arr[i]){
                for(int j=2;i*j<n;j++){
                    arr[i*j]=true;
                }
            }
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]<=nums[i]){
                int min=nums[i]-nums[i+1]+1;
                for(int j=min;j<nums[i];j++){
                    if(!arr[j]){
                        nums[i]-=j;
                        break;
                    }
                }
                if(nums[i+1]<=nums[i]) return false;
            }
        }
        return true;
    }
}