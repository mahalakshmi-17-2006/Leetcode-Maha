// Last updated: 9/5/2026, 1:23:32 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3         if (k <= 1) {
4            return 0;
5        }
6
7        int left = 0;
8        int product = 1;
9        int count = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12
13            product *= nums[right];
14
15            while (product >= k) {
16                product /= nums[left];
17                left++;
18            }
19
20            count += right - left + 1;
21        }
22
23        return count;
24    }
25}