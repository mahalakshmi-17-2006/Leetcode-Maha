// Last updated: 9/5/2026, 12:58:30 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2) {
4            return nums.length;
5        }
6
7        int k = 2;
8
9        for (int i = 2; i < nums.length; i++) {
10            
11            if (nums[i] != nums[k - 2]) {
12                nums[k] = nums[i];
13                k++;
14            }
15        }
16
17        return k;
18    }
19}