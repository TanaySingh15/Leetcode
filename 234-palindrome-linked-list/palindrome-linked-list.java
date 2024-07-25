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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode node = head;
        while(head!=null){
            stk.add(head.val);
            head=head.next;
        }
        while(!stk.isEmpty()){
            if(node.val != stk.peek()) return false;
            stk.pop();
            node = node.next;
        }
        return true;
    }
}