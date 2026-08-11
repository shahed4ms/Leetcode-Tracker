// Last updated: 11/08/2026, 11:36:08
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxVal = 0;
        int minVal = Integer.MAX_VALUE;

        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
        }

        return (long) k * (maxVal - minVal);
    }
}