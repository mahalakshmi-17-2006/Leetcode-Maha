// Last updated: 9/5/2026, 1:08:43 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length()) {
4            return false;
5        }
6
7        int[] count1 = new int[26];
8        int[] count2 = new int[26];
9        for (char ch : s1.toCharArray()) {
10            count1[ch - 'a']++;
11        }
12
13        int windowSize = s1.length();
14
15        for (int i = 0; i < s2.length(); i++) {
16            count2[s2.charAt(i) - 'a']++;
17            if (i >= windowSize) {
18                count2[s2.charAt(i - windowSize) - 'a']--;
19            }
20
21            if (Arrays.equals(count1, count2)) {
22                return true;
23            }
24        }
25
26        return false;
27    }
28}