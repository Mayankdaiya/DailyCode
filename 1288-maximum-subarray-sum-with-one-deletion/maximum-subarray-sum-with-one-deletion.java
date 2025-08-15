class Solution {
    public int maximumSum(int[] arr) {
        int max=arr[0], nd=max, od=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            od=Math.max(nd,od==Integer.MIN_VALUE?od:(od+arr[i]));
            nd=Math.max(arr[i],nd+arr[i]);
            max=Math.max(max,Math.max(od,nd));
        }
        return max;
    }
}