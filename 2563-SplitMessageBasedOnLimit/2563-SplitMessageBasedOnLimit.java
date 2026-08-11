// Last updated: 8/11/2026, 2:15:59 PM
class Solution {
    public String[] splitMessage(String message, int limit) {
        int n = message.length();
        int digitsSum = 0;
        for (int b = 1; b <= n; b++) {
            digitsSum += String.valueOf(b).length();
            int digitsB = String.valueOf(b).length();
            int capacity = b * (limit - digitsB - 3) - digitsSum;
            if (limit - digitsB - 3 <= 0)
                continue;
            if (capacity < n)
                continue;
            String[] ans = new String[b];
            int idx = 0;
            for (int a = 1; a <= b; a++) {
                String suffix = "<" + a + "/" + b + ">";
                int take = limit - suffix.length();
                ans[a - 1] = message.substring(idx,
                        Math.min(idx + take, n)) + suffix;
                idx += take;
            }
            return ans;
        }
        return new String[0];
    }
}