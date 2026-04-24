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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int point = getSize(head) - n;
        ListNode toDel = head;
        int x = 0;

        if (point == 0)
            return head.next;

        while (x < point - 1) {
            toDel = toDel.next;
            x++;
        }

        ListNode temp = toDel.next;
        toDel.next = temp.next;
        temp.next = null;

        return head;
    }

    public int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}