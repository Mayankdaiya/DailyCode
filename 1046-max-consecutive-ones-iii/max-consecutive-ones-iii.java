class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, max = Integer.MIN_VALUE, zeroCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounter++;
            }
            while (zeroCounter > k) {
                if (nums[start] == 0) {
                    zeroCounter--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}