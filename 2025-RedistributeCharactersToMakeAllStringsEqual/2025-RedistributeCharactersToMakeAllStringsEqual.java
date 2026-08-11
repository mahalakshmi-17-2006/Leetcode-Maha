// Last updated: 8/11/2026, 2:16:30 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        int n = words.length;

        for (int count : freq) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
}