// Last updated: 9/5/2026, 1:02:02 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left = 0;
4        long right = (long) Math.sqrt(c);
5
6        while (left <= right) {
7
8            long sum = left * left + right * right;
9
10            if (sum == c) {
11                return true;
12            } 
13            else if (sum < c) {
14                left++;
15            } 
16            else {
17                right--;
18            }
19        }
20
21        return false;
22    }
23}