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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {
            int val1 = (num1 != null) ? num1.val : 0;
            int val2 = (num2 != null) ? num2.val : 0;

            int sum = val1 + val2 + carry;

            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            ans.next = new ListNode(sum);
            ans = ans.next;

            if (num1 != null) num1 = num1.next;
            if (num2 != null) num2 = num2.next;
        }

        return dummy.next;
    }
}
