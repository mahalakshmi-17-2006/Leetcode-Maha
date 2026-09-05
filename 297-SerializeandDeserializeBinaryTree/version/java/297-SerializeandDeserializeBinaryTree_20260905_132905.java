// Last updated: 9/5/2026, 1:29:05 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        StringBuilder sb = new StringBuilder();
15        serializeHelper(root, sb);
16
17        return sb.toString();
18    
19    }
20    private void serializeHelper(TreeNode node, StringBuilder sb) {
21
22        if (node == null) {
23            sb.append("null,");
24            return;
25        }
26
27        // Store current node
28        sb.append(node.val).append(",");
29
30        // Store left subtree
31        serializeHelper(node.left, sb);
32
33        // Store right subtree
34        serializeHelper(node.right, sb);
35    }
36
37
38    // Decodes your encoded data to tree.
39    public TreeNode deserialize(String data) {
40        String[] values = data.split(",");
41
42        int[] index = new int[1];
43
44        return deserializeHelper(values, index);
45    }
46    private TreeNode deserializeHelper(String[] values, int[] index) {
47
48        // If current value is null
49        if (values[index[0]].equals("null")) {
50            index[0]++;
51            return null;
52        }
53
54        // Create node
55        TreeNode node = new TreeNode(
56            Integer.parseInt(values[index[0]])
57        );
58
59        index[0]++;
60
61        // Build left subtree
62        node.left = deserializeHelper(values, index);
63
64        // Build right subtree
65        node.right = deserializeHelper(values, index);
66
67        return node;
68    }
69}
70
71// Your Codec object will be instantiated and called as such:
72// Codec ser = new Codec();
73// Codec deser = new Codec();
74// TreeNode ans = deser.deserialize(ser.serialize(root));