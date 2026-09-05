// Last updated: 9/5/2026, 1:24:31 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4
5        int left = 0;
6        long sum = 0;
7        int maxFrequency = 0;
8
9        for (int right = 0; right < nums.length; right++) {
10
11            sum += nums[right];
12
13            while ((long) nums[right] * (right - left + 1) - sum > k) {
14
15                sum -= nums[left];
16                left++;
17            }
18
19            maxFrequency = Math.max(
20                maxFrequency,
21                right - left + 1
22            );
23        }
24
25        return maxFrequency;
26    }
27}