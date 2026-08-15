// Last updated: 8/15/2026, 9:18:40 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if (nums1.length > nums2.length) {
4            return findMedianSortedArrays(nums2, nums1);
5        }
6
7        int m = nums1.length;
8        int n = nums2.length;
9
10        int low = 0;
11        int high = m;
12
13        while (low <= high) {
14
15            int cut1 = (low + high) / 2;
16            int cut2 = (m + n + 1) / 2 - cut1;
17
18            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
19            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
20
21            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
22            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
23
24            if (left1 <= right2 && left2 <= right1) {
25
26                // Odd total length
27                if ((m + n) % 2 == 1) {
28                    return Math.max(left1, left2);
29                }
30
31                // Even total length
32                return (Math.max(left1, left2)
33                        + Math.min(right1, right2)) / 2.0;
34
35            } else if (left1 > right2) {
36                high = cut1 - 1;
37            } else {
38                low = cut1 + 1;
39            }
40        }
41        return 0.0;
42    }
43}