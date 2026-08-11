// Last updated: 8/11/2026, 2:17:39 PM
class Solution {
    public int minSteps(String s, String t) {
         int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        int steps = 0;

        for (int value : count) {
            if (value > 0) {
                steps += value;
            }
        }

        return steps;
    }
}