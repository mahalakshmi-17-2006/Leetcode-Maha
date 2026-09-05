// Last updated: 9/5/2026, 1:03:43 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3         int[] count = new int[26];
4
5        int left = 0;
6        int maxFrequency = 0;
7        int maxLength = 0;
8
9        for (int right = 0; right < s.length(); right++) {
10            count[s.charAt(right) - 'A']++;
11            maxFrequency = Math.max(
12                maxFrequency,
13                count[s.charAt(right) - 'A']
14            );
15
16            while ((right - left + 1) - maxFrequency > k) {
17
18                count[s.charAt(left) - 'A']--;
19                left++;
20            }
21
22            maxLength = Math.max(
23                maxLength,
24                right - left + 1
25            );
26        }
27
28        return maxLength;
29    }
30}