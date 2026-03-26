class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if (n == 1) return true;
        int even = 0, odd = 0;
        for (int x : nums1) {
            if ((x & 1) == 0) even++;
            else odd++;
        }

        // All even OR all odd possible
        return (even > 0) || (odd > 1);
    }
}