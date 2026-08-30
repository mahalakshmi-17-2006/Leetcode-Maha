// Last updated: 8/30/2026, 10:57:25 AM
1class Solution {
2    public int countCompleteSubstrings(String word, int k) {
3        int n = word.length();
4        int ans = 0;
5
6        for (int distinct = 1; distinct <= 26; distinct++) {
7            int len = distinct * k;
8
9            if (len > n) {
10                break;
11            }
12
13            int[] freq = new int[26];
14            int count = 0;
15
16            for (int i = 0; i < n; i++) {
17                if (i > 0 && Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
18                    freq = new int[26];
19                    count = 0;
20                }
21
22                int index = word.charAt(i) - 'a';
23                freq[index]++;
24                count++;
25
26                if (count > len) {
27                    int remove = word.charAt(i - len) - 'a';
28                    freq[remove]--;
29                    count--;
30                }
31
32                if (count == len) {
33                    boolean valid = true;
34
35                    for (int j = 0; j < 26; j++) {
36                        if (freq[j] != 0 && freq[j] != k) {
37                            valid = false;
38                            break;
39                        }
40                    }
41
42                    if (valid) {
43                        ans++;
44                    }
45                }
46            }
47        }
48
49        return ans;
50    }
51}
52