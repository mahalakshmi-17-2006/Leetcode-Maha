// Last updated: 8/22/2026, 9:30:34 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        for (char c : t.toCharArray()) {
5            map.put(c, map.getOrDefault(c, 0) + 1);
6        }
7
8        int left = 0;
9        int minLength = Integer.MAX_VALUE;
10        int start = 0;
11        int required = t.length();
12        for (int right = 0; right < s.length(); right++) {
13
14            char c = s.charAt(right);
15
16            if (map.containsKey(c)) {
17                if (map.get(c) > 0) {
18                    required--;
19                }
20
21                map.put(c, map.get(c) - 1);
22            }
23            while (required == 0) {
24                if (right - left + 1 < minLength) {
25                    minLength = right - left + 1;
26                    start = left;
27                }
28
29                char leftChar = s.charAt(left);
30
31                if (map.containsKey(leftChar)) {
32                    map.put(leftChar, map.get(leftChar) + 1);
33
34                    if (map.get(leftChar) > 0) {
35                        required++;
36                    }
37                }
38
39                left++;
40            }
41        }
42
43        return minLength == Integer.MAX_VALUE
44                ? ""
45                : s.substring(start, start + minLength);
46    
47    }
48}