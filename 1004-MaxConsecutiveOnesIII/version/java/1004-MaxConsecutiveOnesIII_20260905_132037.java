// Last updated: 9/5/2026, 1:20:37 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int zeros = 0;
5        int maxLength = 0;
6
7        for (int right = 0; right < nums.length; right++) {
8            if (nums[right] == 0) {
9                zeros++;
10            }
11
12            while (zeros > k) {
13
14                if (nums[left] == 0) {
15                    zeros--;
16                }
17
18                left++;
19            }
20
21            maxLength = Math.max(
22                maxLength,
23                right - left + 1
24            );
25        }
26
27        return maxLength;
28    }
29}