// Last updated: 8/11/2026, 2:15:05 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;

        // Find maximum frequency
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int ans = 0;

        // Add all frequencies equal to maxFreq
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans;
    }
}