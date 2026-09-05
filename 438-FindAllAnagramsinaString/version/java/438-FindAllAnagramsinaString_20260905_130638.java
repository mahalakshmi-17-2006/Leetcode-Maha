// Last updated: 9/5/2026, 1:06:38 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> result = new ArrayList<>();
4
5        if (s.length() < p.length()) {
6            return result;
7        }
8
9        int[] pCount = new int[26];
10        int[] windowCount = new int[26];
11        for (char ch : p.toCharArray()) {
12            pCount[ch - 'a']++;
13        }
14
15        int windowSize = p.length();
16
17        for (int i = 0; i < s.length(); i++) {
18            windowCount[s.charAt(i) - 'a']++;
19            if (i >= windowSize) {
20                windowCount[s.charAt(i - windowSize) - 'a']--;
21            }
22            if (Arrays.equals(pCount, windowCount)) {
23                result.add(i - windowSize + 1);
24            }
25        }
26
27        return result;
28    }
29}