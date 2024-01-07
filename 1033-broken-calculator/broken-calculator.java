class Solution {
    public int brokenCalc(int startValue, int target) {
        return solve(startValue,target);
    }
    public static int solve(int num,int target){
        if(num>=target) return num-target;
        if(target%2==0) return 1+solve(num,target/2);
        return 1+solve(num,target+1);
    }
}