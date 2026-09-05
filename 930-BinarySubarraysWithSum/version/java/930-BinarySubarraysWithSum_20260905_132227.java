// Last updated: 9/5/2026, 1:22:27 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3         Map<Integer, Integer> map = new HashMap<>();
4
5        map.put(0, 1);
6
7        int sum = 0;
8        int count = 0;
9
10        for (int num : nums) {
11
12            sum += num;
13
14            count += map.getOrDefault(sum - goal, 0);
15
16            map.put(sum, map.getOrDefault(sum, 0) + 1);
17        }
18
19        return count;
20    }
21}