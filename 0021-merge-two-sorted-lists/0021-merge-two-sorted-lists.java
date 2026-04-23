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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null)
        return list2;
        if(list2 == null)
        return list1;  
        if(list1.val < list2.val)
        {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 != null && curr2 != null)
        {
            while(curr2.next != null && curr2.next.val <= curr1.val)
            {
                curr2 = curr2.next;
            }
            ListNode next1 = curr1.next; 
            ListNode next2 = curr2.next;
            
            curr2.next = curr1;
            curr1.next = next2;
            curr2 = curr1;
            curr1 = next1;
        }
        return list2;
         
    }
}