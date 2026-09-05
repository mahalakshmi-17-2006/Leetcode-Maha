// Last updated: 9/5/2026, 12:38:09 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3         int left = 0;
4        int right = numbers.length - 1;
5
6        while (left < right) {
7
8            int sum = numbers[left] + numbers[right];
9
10            if (sum == target) {
11                return new int[]{left + 1, right + 1};
12            }
13
14            else if (sum < target) {
15                left++;
16            }
17
18            else {
19                right--;
20            }
21        }
22
23        return new int[]{};
24    }
25}