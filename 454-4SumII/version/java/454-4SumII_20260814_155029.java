// Last updated: 8/14/2026, 3:50:29 PM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int a : nums1) {
5            for (int b : nums2) {
6                int sum = a + b;
7                map.put(sum, map.getOrDefault(sum, 0) + 1);
8            }
9        }
10
11        int count = 0;
12        for (int c : nums3) {
13            for (int d : nums4) {
14                int sum = -(c + d);
15
16                if (map.containsKey(sum)) {
17                    count += map.get(sum);
18                }
19            }
20        }
21
22        return count;
23    }
24}