// Last updated: 9/3/2026, 2:41:22 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1;
4        int right = 0;
5        for (int pile : piles) {
6            right = Math.max(right, pile);
7        }
8        while (left < right) {
9
10            int mid = left + (right - left) / 2;
11
12            long hours = 0;
13            for (int pile : piles) {
14                hours += (pile + mid - 1) / mid;
15            }
16
17            if (hours <= h) {
18                right = mid;
19            } else {
20                left = mid + 1;
21            }
22        }
23
24        return left;
25    }
26}