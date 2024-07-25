/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA,nodeB = headB;
        int nA = 0, nB = 0;
        while(nodeA!=null && nodeB!=null){
            nA++;
            nB++;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        while(nodeA!=null){
            nA++;
            nodeA = nodeA.next;
        }
        while(nodeB!=null){
            nB++;
            nodeB = nodeB.next;
        }
        nodeA = headA;
        nodeB = headB;
        System.out.println(nA+" "+nB+" ");
        while(nA!=nB){
            if(nA > nB){
                System.out.print(nodeA.val+" ");
                nodeA = nodeA.next;
                nA--;
            }
            else {
                System.out.print(nodeB.val+" ");
                nodeB = nodeB.next;
                nB--;
            }
        }

        while(nA != 0){
            if(nodeA == nodeB) return nodeA;
            else{
                nodeA = nodeA.next;
                nodeB = nodeB.next;
                nA--;
            }
        }
        return null;    
    }
}