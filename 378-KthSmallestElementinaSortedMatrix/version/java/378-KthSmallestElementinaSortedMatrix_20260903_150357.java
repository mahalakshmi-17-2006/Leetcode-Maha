// Last updated: 9/3/2026, 3:03:57 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4
5        int left = matrix[0][0];
6        int right = matrix[n - 1][n - 1];
7
8        while (left < right) {
9
10            int mid = left + (right - left) / 2;
11
12            int count = countLessEqual(matrix, mid);
13
14            if (count < k) {
15                left = mid + 1;
16            } else {
17                right = mid;
18            }
19        }
20
21        return left;
22    }
23
24    private int countLessEqual(int[][] matrix, int target) {
25
26        int n = matrix.length;
27        int row = n - 1;
28        int col = 0;
29
30        int count = 0;
31
32        while (row >= 0 && col < n) {
33
34            if (matrix[row][col] <= target) {
35
36                count += row + 1;
37                col++;
38
39            } else {
40
41                row--;
42            }
43        }
44
45        return count;
46    }
47}