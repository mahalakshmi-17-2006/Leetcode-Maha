// Last updated: 9/5/2026, 12:52:45 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int cameras=0;
18    public int minCameraCover(TreeNode root) {
19        if (dfs(root) == 0) {
20            cameras++;
21        }
22
23        return cameras;
24    }
25
26    private int dfs(TreeNode node) {
27
28        if (node == null) {
29            return 2;
30        }
31
32        int left = dfs(node.left);
33        int right = dfs(node.right);
34
35        if (left == 0 || right == 0) {
36            cameras++;
37            return 1;
38        }
39
40        if (left == 1 || right == 1) {
41            return 2;
42        }
43
44
45        return 0;
46    }
47}