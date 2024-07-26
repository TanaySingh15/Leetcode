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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int size = size(head);
        while(k>=size){
            k=k-size;
        }
        if(k==0) return head;
        ListNode kFromEnd = getK(head,k);
        ListNode newHead = kFromEnd.next;
        ListNode node = newHead;
        kFromEnd.next = null;
        while(node.next!=null){
            node = node.next;
        }
        node.next=head;
        return newHead;
    }

    static int size(ListNode head){
        int s = 0;
        while(head!=null){
            s++;
            head=head.next;
        }
        return s;
    }

    static ListNode getK(ListNode n, int k){
        ListNode s=n,f=n;
        for(int i=0;i<=k;i++){
            f=f.next;
        }
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        return s;
    }

}