// Last updated: 9/5/2026, 1:18:51 PM
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
17     List<int[]> nodes = new ArrayList<>();
18    public List<List<Integer>> verticalTraversal(TreeNode root) {
19         // Store each node as {column, row, value}
20        dfs(root, 0, 0);
21
22        // Sort by column, then row, then value
23        Collections.sort(nodes, (a, b) -> {
24            if (a[0] != b[0]) {
25                return Integer.compare(a[0], b[0]);
26            }
27
28            if (a[1] != b[1]) {
29                return Integer.compare(a[1], b[1]);
30            }
31
32            return Integer.compare(a[2], b[2]);
33        });
34
35        List<List<Integer>> result = new ArrayList<>();
36
37        int previousColumn = Integer.MIN_VALUE;
38
39        for (int[] node : nodes) {
40
41            int column = node[0];
42            int value = node[2];
43
44            // Create a new list for a new column
45            if (column != previousColumn) {
46                result.add(new ArrayList<>());
47                previousColumn = column;
48            }
49
50            result.get(result.size() - 1).add(value);
51        }
52
53        return result;
54    }
55
56    private void dfs(TreeNode node, int row, int col) {
57
58        if (node == null) {
59            return;
60        }
61
62        // Store {column, row, value}
63        nodes.add(new int[]{col, row, node.val});
64
65        // Left child
66        dfs(node.left, row + 1, col - 1);
67
68        // Right child
69        dfs(node.right, row + 1, col + 1);
70    }
71}