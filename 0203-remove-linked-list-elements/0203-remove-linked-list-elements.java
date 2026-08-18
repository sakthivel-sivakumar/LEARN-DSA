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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy  = new ListNode();
        ListNode curr  =  dummy;
        if(head == null || (head.next == null && head.val == val))
            return null;
        
        while(head != null){
            if(head.val != val){
                curr.next = head;
                curr = curr.next; 
            }
            
            head = head.next;
        }
        curr.next = null;

        return dummy.next;

    }
}