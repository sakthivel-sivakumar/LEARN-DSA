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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode left = head;
        ListNode right = head;

        // Move the right pointer n steps ahead to maintain the distance b/w 2 pointers
        for(int i=1;i<=n;i++)
            right = right.next;

        if (right == null)
            return head.next;
            
        while(right.next!=null)
        {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }
}