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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            if(lists[i] == null) continue;
            pq.add(new Triplet(lists[i],i,lists[i]));
        }
        ListNode head = null;
        ListNode curr = null;
        int i = 1;
        while(!pq.isEmpty()){
            Triplet t = pq.poll();
            if(i==1){
                head = t.val;
                curr = t.val;
                i++;
            } else {
                curr.next = t.val;
                curr = curr.next;
            }
            if(t.node.next!=null){
                pq.add(new Triplet(t.node.next,t.i,t.node.next));
            }
        }
        return head;
    }
}

class Triplet implements Comparable<Triplet>{
    ListNode val;
    int i;
    ListNode node;
    Triplet(ListNode val,int i,ListNode node){
        this.val = val;
        this.i = i;
        this.node = node;
    }
    public int compareTo(Triplet t){
        if(val.val <= t.val.val) return -1;
        else return 1;
    }
}