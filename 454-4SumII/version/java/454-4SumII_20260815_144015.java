// Last updated: 8/15/2026, 2:40:15 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode fast = dummy;
17        ListNode slow = dummy;
18        for (int i = 0; i < n; i++) {
19            fast = fast.next;
20        }
21
22        while (fast.next != null) {
23            fast = fast.next;
24            slow = slow.next;
25        }
26
27        slow.next = slow.next.next;
28        return dummy.next;
29    }
30}