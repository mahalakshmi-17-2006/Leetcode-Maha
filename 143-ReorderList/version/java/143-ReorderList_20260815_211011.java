// Last updated: 8/15/2026, 9:10:11 PM
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
12    public void reorderList(ListNode head) {
13        
14        if (head == null || head.next == null)
15            return;
16        ListNode slow = head;
17        ListNode fast = head;
18
19        while (fast != null && fast.next != null) {
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23
24        ListNode second = slow.next;
25        slow.next = null;
26
27        ListNode prev = null;
28
29        while (second != null) {
30            ListNode next = second.next;
31            second.next = prev;
32            prev = second;
33            second = next;
34        }
35
36        ListNode first = head;
37        second = prev;
38
39        while (second != null) {
40            ListNode next1 = first.next;
41            ListNode next2 = second.next;
42
43            first.next = second;
44            second.next = next1;
45
46            first = next1;
47            second = next2;
48        }
49    }
50}