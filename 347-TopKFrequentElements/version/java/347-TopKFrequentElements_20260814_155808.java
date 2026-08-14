// Last updated: 8/14/2026, 3:58:08 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        int[] count = new int[20001];
4        for (int num : nums) {
5            count[num + 10000]++;
6        }
7        int[] ans = new int[k];
8        int index = 0;
9
10        for (int freq = nums.length; freq >= 1 && index < k; freq--) {
11
12            for (int i = 0; i < count.length && index < k; i++) {
13
14                if (count[i] == freq) {
15                    ans[index++] = i - 10000;
16                }
17            }
18        }
19
20        return ans;
21    }
22}