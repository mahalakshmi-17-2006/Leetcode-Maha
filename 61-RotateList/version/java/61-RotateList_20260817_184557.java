// Last updated: 8/17/2026, 6:45:57 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0)
14            return head;
15        int n = 1;
16        ListNode tail = head;
17
18        while (tail.next != null) {
19            tail = tail.next;
20            n++;
21        }
22        k = k % n;
23
24        if (k == 0)
25            return head;
26
27        tail.next = head;
28        int steps = n - k;
29        ListNode newTail = head;
30
31        for (int i = 1; i < steps; i++) {
32            newTail = newTail.next;
33        }
34
35        ListNode newHead = newTail.next;
36
37        newTail.next = null;
38
39        return newHead;
40    }
41}