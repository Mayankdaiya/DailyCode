class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[32]; 
        int left = 0, right = 0;
        int currentOR = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < n) {
            updateFreq(freq, nums[right], 1);
            currentOR |= nums[right];
            while (left <= right && currentOR >= k) {
                minLength = Math.min(minLength, right - left + 1);
                int val = nums[left];
                int updated = updateFreq(freq, val, -1); 
                if(updated != currentOR) {
                    currentOR = updated;
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

   private int updateFreq(int[] freq, int num, int opr) {
        int updated = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                freq[i] += opr; 
            }
        }
        for (int i = 0; i < 32; i++) {
            if (freq[i] > 0) {
                updated |= (1 << i);
            }
        }
        return updated;
   }    
}