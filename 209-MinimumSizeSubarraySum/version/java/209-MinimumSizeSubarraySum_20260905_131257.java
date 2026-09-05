// Last updated: 9/5/2026, 1:12:57 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int minLength = Integer.MAX_VALUE;
6
7        for (int right = 0; right < nums.length; right++) {
8
9            sum += nums[right];
10
11            while (sum >= target) {
12
13                minLength = Math.min(
14                    minLength,
15                    right - left + 1
16                );
17
18                sum -= nums[left];
19                left++;
20            }
21        }
22
23        return minLength == Integer.MAX_VALUE ? 0 : minLength;
24    }
25}