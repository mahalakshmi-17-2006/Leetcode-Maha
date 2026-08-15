// Last updated: 8/15/2026, 9:20:06 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null)
19            return null;
20
21        HashMap<Node, Node> map = new HashMap<>();
22
23        Node curr = head;
24
25        while (curr != null) {
26            map.put(curr, new Node(curr.val));
27            curr = curr.next;
28        }
29
30        curr = head;
31
32        while (curr != null) {
33            Node copy = map.get(curr);
34
35            copy.next = map.get(curr.next);
36            copy.random = map.get(curr.random);
37
38            curr = curr.next;
39        }
40
41        return map.get(head);
42    }
43}