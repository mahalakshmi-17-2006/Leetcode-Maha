// Last updated: 8/11/2026, 2:16:36 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';

            if (!visited[index]) {
                visited[index] = true;
                count++;
            }
        }

        return count == 26;
    }
    
}