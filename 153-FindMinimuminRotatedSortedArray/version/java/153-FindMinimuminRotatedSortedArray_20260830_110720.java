// Last updated: 8/30/2026, 11:07:20 AM
1
2class Solution {
3    public int findMin(int[] nums) {
4        int low = 0;
5        int high = nums.length - 1;
6
7        while (low < high) {
8            int mid = low + (high - low) / 2;
9
10            if (nums[mid] > nums[high]) {
11                low = mid + 1;
12            } else {
13                high = mid;
14            }
15        }
16
17        return nums[low];
18    }
19}
20
21