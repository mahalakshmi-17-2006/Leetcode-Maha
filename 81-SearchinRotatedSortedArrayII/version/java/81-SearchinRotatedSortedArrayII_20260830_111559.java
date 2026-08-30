// Last updated: 8/30/2026, 11:15:59 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] == target) {
10                return true;
11            }
12
13            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
14                low++;
15                high--;
16            } else if (nums[low] <= nums[mid]) {
17                if (nums[low] <= target && target < nums[mid]) {
18                    high = mid - 1;
19                } else {
20                    low = mid + 1;
21                }
22            } else {
23                if (nums[mid] < target && target <= nums[high]) {
24                    low = mid + 1;
25                } else {
26                    high = mid - 1;
27                }
28            }
29        }
30
31        return false;
32    }
33}
34
35