// Last updated: 8/15/2026, 9:16:01 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode less = new ListNode(0);
14        ListNode greater = new ListNode(0);
15
16        ListNode p1 = less;
17        ListNode p2 = greater;
18
19        while (head != null) {
20
21            if (head.val < x) {
22                p1.next = head;
23                p1 = p1.next;
24            } else {
25                p2.next = head;
26                p2 = p2.next;
27            }
28
29            head = head.next;
30        }
31        p2.next = null;
32        p1.next = greater.next;
33
34        return less.next;
35    }
36}