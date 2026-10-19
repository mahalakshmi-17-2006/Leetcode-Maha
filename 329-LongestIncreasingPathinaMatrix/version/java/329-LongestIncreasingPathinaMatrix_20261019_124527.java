// Last updated: 10/19/2026, 12:45:27 PM
1class Solution {
2    int m, n;
3    int[][] dp;
4    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
5    public int longestIncreasingPath(int[][] matrix) {
6        m = matrix.length;
7        n = matrix[0].length;
8        dp = new int[m][n];
9        int ans = 0;
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                ans = Math.max(ans, dfs(matrix, i, j));
14            }
15        }
16
17        return ans;
18    }
19    int dfs(int[][] matrix, int i, int j) {
20        if (dp[i][j] != 0)
21            return dp[i][j];
22
23        dp[i][j] = 1;
24
25        for (int[] d : dir) {
26            int x = i + d[0];
27            int y = j + d[1];
28
29            if (x >= 0 && x < m && y >= 0 && y < n
30                    && matrix[x][y] > matrix[i][j]) {
31                dp[i][j] = Math.max(dp[i][j],
32                        1 + dfs(matrix, x, y));
33            }
34        }
35
36        return dp[i][j];
37    }
38}