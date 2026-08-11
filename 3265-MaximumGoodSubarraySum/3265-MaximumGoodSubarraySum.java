// Last updated: 8/11/2026, 2:14:57 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int x : nums) {
            if (map.containsKey(x - k)) {
                ans = Math.max(ans, prefix + x - map.get(x - k));
            }

            if (map.containsKey(x + k)) {
                ans = Math.max(ans, prefix + x - map.get(x + k));
            }

            map.put(x, Math.min(map.getOrDefault(x, Long.MAX_VALUE), prefix));
            prefix += x;
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}