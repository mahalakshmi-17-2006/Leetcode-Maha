// Last updated: 8/11/2026, 2:16:33 PM
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            ans[index] = word.substring(0, word.length() - 1);
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ans.length; i++) {
            result.append(ans[i]);
            if (i != ans.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}