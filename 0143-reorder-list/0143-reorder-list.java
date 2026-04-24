/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode start = head;

        while (start != null && start.next != null && start.next.next != null) {
            ListNode prevToEnd = start;

            while (prevToEnd.next.next != null) {
                prevToEnd = prevToEnd.next;
            }

            ListNode end = prevToEnd.next;
            prevToEnd.next = null;

            end.next = start.next;
            start.next = end;

            start = end.next;
        }
    }
}
