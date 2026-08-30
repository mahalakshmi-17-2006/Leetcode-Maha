// Last updated: 8/30/2026, 10:36:40 AM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int third = Integer.MIN_VALUE; 
4        int[] stack = new int[nums.length]; 
5        int top = -1; 
6        for (int i = nums.length - 1; i >= 0; i--) { 
7            if (nums[i] < third) { return true; 
8        }
9         while (top >= 0 && nums[i] > stack[top]) { 
10            third = stack[top--]; 
11        }
12        stack[++top] = nums[i]; 
13        } 
14        return false;
15    }
16}