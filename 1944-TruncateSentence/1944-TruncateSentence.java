// Last updated: 8/11/2026, 2:16:43 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            ans.append(arr[i]);

            if (i != k - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}