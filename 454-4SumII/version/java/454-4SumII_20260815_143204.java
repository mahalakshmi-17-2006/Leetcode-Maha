// Last updated: 8/15/2026, 2:32:04 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] row = new boolean[9][9];
4        boolean[][] col = new boolean[9][9];
5        boolean[][] box = new boolean[9][9];
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9
10                if (board[i][j] == '.') {
11                    continue;
12                }
13
14                int num = board[i][j] - '1';
15                int boxIndex = (i / 3) * 3 + (j / 3);
16
17                if (row[i][num] || col[j][num] || box[boxIndex][num]) {
18                    return false;
19                }
20
21                row[i][num] = true;
22                col[j][num] = true;
23                box[boxIndex][num] = true;
24            }
25        }
26
27        return true;
28    }
29}