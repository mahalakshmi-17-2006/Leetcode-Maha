// Last updated: 8/30/2026, 10:49:39 AM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) { 
4            return x; 
5        } 
6        int low = 1; 
7        int high = x / 2; 
8        int ans = 1; 
9        while (low <= high) { 
10            int mid = low + (high - low) / 2; 
11            if ((long) mid * mid <= x) {
12                 ans = mid; low = mid + 1; 
13                } 
14            else {
15                high = mid - 1; 
16            } 
17        }
18        return ans;
19    }
20}