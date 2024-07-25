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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode node = head;
        Stack<Integer> stk = new Stack<>();
        while(node!=null){
            stk.push(node.val);
            node = node.next;
        }
        node = head;
        while(!stk.isEmpty()){
            node.val = stk.pop();
            node = node.next;
        }
        return head;
    }
}