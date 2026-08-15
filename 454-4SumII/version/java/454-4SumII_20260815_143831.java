// Last updated: 8/15/2026, 2:38:31 PM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0;
4        int high = 0;
5        for (int num : nums) {
6            low = Math.max(low, num);
7            high += num;
8        }
9
10        while (low < high) {
11
12            int mid = low + (high - low) / 2;
13
14            if (canSplit(nums, k, mid)) {
15                high = mid;
16            } else {
17                low = mid + 1;
18            }
19        }
20
21        return low;
22    }
23
24    static boolean canSplit(int[] nums, int k, int maxSum) {
25        int count = 1;
26        int sum = 0;
27
28        for (int num : nums) {
29
30            if (sum + num > maxSum) {
31                count++;
32                sum = num;
33            } else {
34                sum += num;
35            }
36        }
37
38        return count <= k;
39    }
40}