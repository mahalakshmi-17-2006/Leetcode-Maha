// Last updated: 8/30/2026, 11:10:10 AM
1class Solution {
2
3    public int[] searchRange(int[] nums, int target) {
4
5        int first = findFirst(nums, target);
6        int last = findLast(nums, target);
7
8        return new int[]{first, last};
9    }
10
11    // Find first occurrence
12    private int findFirst(int[] nums, int target) {
13
14        int left = 0;
15        int right = nums.length - 1;
16        int ans = -1;
17
18        while (left <= right) {
19
20            int mid = left + (right - left) / 2;
21
22            if (nums[mid] == target) {
23                ans = mid;
24                right = mid - 1;   // search on left side
25            }
26            else if (nums[mid] < target) {
27                left = mid + 1;
28            }
29            else {
30                right = mid - 1;
31            }
32        }
33
34        return ans;
35    }
36
37    // Find last occurrence
38    private int findLast(int[] nums, int target) {
39
40        int left = 0;
41        int right = nums.length - 1;
42        int ans = -1;
43
44        while (left <= right) {
45
46            int mid = left + (right - left) / 2;
47
48            if (nums[mid] == target) {
49                ans = mid;
50                left = mid + 1;    // search on right side
51            }
52            else if (nums[mid] < target) {
53                left = mid + 1;
54            }
55            else {
56                right = mid - 1;
57            }
58        }
59
60        return ans;
61    }
62}
63
64