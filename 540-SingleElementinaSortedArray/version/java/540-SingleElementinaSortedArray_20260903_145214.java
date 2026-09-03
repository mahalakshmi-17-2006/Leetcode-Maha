// Last updated: 9/3/2026, 2:52:14 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3         int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7
8            int mid = left + (right - left) / 2;
9            if (mid % 2 == 1) {
10                mid--;
11            }
12
13            if (nums[mid] == nums[mid + 1]) {
14                left = mid + 2;
15            } else {
16                right = mid;
17            }
18        }
19
20        return nums[left];
21    }
22}