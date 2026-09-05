// Last updated: 9/5/2026, 12:59:54 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");
5
6        int maxLength = Math.max(v1.length, v2.length);
7
8        for (int i = 0; i < maxLength; i++) {
9
10            int num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
11            int num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;
12
13            if (num1 < num2) {
14                return -1;
15            }
16
17            if (num1 > num2) {
18                return 1;
19            }
20        }
21
22        return 0;
23    }
24}