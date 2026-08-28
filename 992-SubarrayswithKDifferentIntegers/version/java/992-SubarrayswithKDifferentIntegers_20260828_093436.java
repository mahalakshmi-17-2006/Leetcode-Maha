// Last updated: 8/28/2026, 9:34:36 AM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMostK(nums, k) - atMostK(nums, k - 1);
4    }
5
6    private int atMostK(int[] nums, int k) {
7        Map<Integer, Integer> map = new HashMap<>();
8        int left = 0;
9        int count = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
13            while (map.size() > k) {
14                map.put(nums[left], map.get(nums[left]) - 1);
15
16                if (map.get(nums[left]) == 0) {
17                    map.remove(nums[left]);
18                }
19
20                left++;
21            }
22            count += right - left + 1;
23        }
24
25        return count;
26    }
27}