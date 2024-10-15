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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next == null) return head;
        ListNode oddHead = null,evenHead = null,odd=null,even=null;
        oddHead = head;
        evenHead = head.next;
        head = head.next.next;
        odd = oddHead;
        even = evenHead;
        int i = 3;
        while(head!=null){
            if(i%2 == 0){
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head=head.next;
            i++;
        }
        even.next=null;
        odd.next=evenHead;
        return oddHead;
    }
}