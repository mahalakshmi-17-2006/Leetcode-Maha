// Last updated: 10/18/2026, 8:45:56 AM
1class Solution {
2    public int[] lastVisitedCell(char[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        boolean[][] visited = new boolean[m][n];
6        int r=0,c=0;
7        visited[r][c]=true;
8
9        while(true){
10            int nr=r;
11            int nc=c;
12            char dir=grid[r][c];
13            if(dir=='L'){
14                nc--;
15            }
16            else if(dir =='R'){
17                nc++;
18            }
19            else if(dir=='U'){
20                nr--;
21            }
22            else if(dir=='D'){
23                nr++;
24            }
25            if(nr<0 || nr>=m || nc<0||nc>=n||visited[nr][nc]){
26                break;
27            }
28            r=nr;
29            c=nc;
30            visited[r][c]=true;
31        }
32        return new int[]{r,c};
33    }
34}