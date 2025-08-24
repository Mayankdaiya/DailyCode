class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE, val = values[0];
        for(int i=1;i<values.length;i++){
            if(values[i]-i+val>ans) ans = values[i]-i+val;
            if(values[i]+i>val) val = values[i]+i;
        }
        return ans;
    }
}