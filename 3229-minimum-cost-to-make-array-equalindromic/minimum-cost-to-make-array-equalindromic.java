class Solution {
    private boolean check(int n){
        long dup=n,rev=0;
        while(dup!=0)
        {
            rev=rev*10+(dup%10);
            dup/=10;
        }
        return rev==n;
    }

    private int palindrome(int num, int inc){
        while(!check(num)){
            num+=inc;
        }
        return num;
    }

    private long findsum(int nums[], int n){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+Math.abs(n-nums[i]);
        }
        return sum;
    }

    public long minimumCost(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length, med=nums[len/2];
        int num1=palindrome(med,-1), num2=palindrome(med,1);
        long sum1=findsum(nums,num1), sum2=findsum(nums,num2);
        return sum1 > sum2 ? sum2 : sum1;
    }
}