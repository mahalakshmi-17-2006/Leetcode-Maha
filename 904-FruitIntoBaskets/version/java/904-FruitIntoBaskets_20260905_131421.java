// Last updated: 9/5/2026, 1:14:21 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        int left = 0;
6        int maxFruits = 0;
7
8        for (int right = 0; right < fruits.length; right++) {
9            map.put(fruits[right],
10                    map.getOrDefault(fruits[right], 0) + 1);
11
12            while (map.size() > 2) {
13
14                map.put(fruits[left],
15                        map.get(fruits[left]) - 1);
16
17                if (map.get(fruits[left]) == 0) {
18                    map.remove(fruits[left]);
19                }
20
21                left++;
22            }
23
24            maxFruits = Math.max(maxFruits, right - left + 1);
25        }
26
27        return maxFruits;
28    }
29}