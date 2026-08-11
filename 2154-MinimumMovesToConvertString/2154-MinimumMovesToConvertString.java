// Last updated: 8/11/2026, 2:16:22 PM
class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // Skip the next 3 characters
            } else {
                i++;
            }
        }

        return moves;
    }
}