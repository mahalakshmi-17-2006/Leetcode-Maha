// Last updated: 8/30/2026, 11:15:10 AM
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
17
18    int maxSum = Integer.MIN_VALUE;
19
20    public int maxPathSum(TreeNode root) {
21        findMaxPath(root);
22        return maxSum;
23    }
24
25    private int findMaxPath(TreeNode root) {
26
27        if (root == null) {
28            return 0;
29        }
30        int left = Math.max(0, findMaxPath(root.left));
31        int right = Math.max(0, findMaxPath(root.right));
32
33        int currentPath = root.val + left + right;
34
35        maxSum = Math.max(maxSum, currentPath);
36
37        return root.val + Math.max(left, right);
38    }
39}
40
41