/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode s=head , f=head;
        do{
            if(f.next==null || f.next.next == null) return null;
            s=s.next;
            f=f.next.next;
        }while(s!=f);
        s = head;
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}