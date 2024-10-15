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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        if(head.next.next == null) {
            head.next = null;
            return head;
        }
        if(head.next.next.next == null) {
            head.next = head.next.next;
            return head;
        }
        ListNode fast=head,slow=head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast.next.next!=null && fast.next.next.next!=null);
        slow.next = slow.next.next;
        return head;
    }
}