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
    ListNode head = null;
    public ListNode rev(ListNode node)
    {
       if(node == null || node.next == null){
            head = node;
            return head;
       }
       rev(node.next).next = node;
       node.next = null;
       return node;
    }
    public ListNode reverseList(ListNode node) 
    {
       rev(node);
       return head;

    }
}