// Last updated: 9/3/2026, 2:46:06 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int left = 0;
4        int right = 0;
5        for (int weight : weights) {
6            left = Math.max(left, weight);
7            right += weight;
8        }
9        while (left < right) {
10
11            int mid = left + (right - left) / 2;
12
13            int requiredDays = 1;
14            int currentWeight = 0;
15
16            for (int weight : weights) {
17
18                if (currentWeight + weight > mid) {
19                    requiredDays++;
20                    currentWeight = 0;
21                }
22
23                currentWeight += weight;
24            }
25
26            if (requiredDays <= days) {
27                right = mid;
28            } else {
29                left = mid + 1;
30            }
31        }
32
33        return left;
34    }
35}