// Last updated: 8/11/2026, 2:15:43 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
         int i = 0;
        int max = 0;
        int n = s.length();

        while (i < n) {
            int zero = 0;
            int one = 0;
            while (i < n && s.charAt(i) == '0') {
                zero++;
                i++;
            }
            while (i < n && s.charAt(i) == '1') {
                one++;
                i++;
            }

            max = Math.max(max, 2 * Math.min(zero, one));
        }

        return max;
    }
}