// Last updated: 10/13/2026, 1:25:46 PM
1class Solution {
2    public int maxCoins(int[] nums) {
3        int n = nums.length;
4        int[] a = new int[n + 2];
5
6        a[0] = 1;
7        a[n + 1] = 1;
8
9        for (int i = 0; i < n; i++) {
10            a[i + 1] = nums[i];
11        }
12
13        int[][] dp = new int[n + 2][n + 2];
14
15        for (int len = 1; len <= n; len++) {
16            for (int l = 1; l <= n - len + 1; l++) {
17                int r = l + len - 1;
18
19                for (int k = l; k <= r; k++) {
20                    int coins = a[l - 1] * a[k] * a[r + 1]
21                              + dp[l][k - 1]
22                              + dp[k + 1][r];
23
24                    dp[l][r] = Math.max(dp[l][r], coins);
25                }
26            }
27        }
28
29        return dp[1][n];
30    }
31}