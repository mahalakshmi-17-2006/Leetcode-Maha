// Last updated: 8/30/2026, 10:33:21 AM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] last = new int[26];
4
5        for (int i = 0; i < s.length(); i++) {
6            last[s.charAt(i) - 'a'] = i;
7        }
8
9        boolean[] used = new boolean[26];
10        StringBuilder stack = new StringBuilder();
11
12        for (int i = 0; i < s.length(); i++) {
13            char ch = s.charAt(i);
14            int index = ch - 'a';
15
16            if (used[index]) {
17                continue;
18            }
19
20            while (stack.length() > 0 &&
21                   stack.charAt(stack.length() - 1) > ch &&
22                   last[stack.charAt(stack.length() - 1) - 'a'] > i) {
23
24                char removed = stack.charAt(stack.length() - 1);
25                stack.deleteCharAt(stack.length() - 1);
26                used[removed - 'a'] = false;
27            }
28
29            stack.append(ch);
30            used[index] = true;
31        }
32
33        return stack.toString();
34    }
35}
36
37