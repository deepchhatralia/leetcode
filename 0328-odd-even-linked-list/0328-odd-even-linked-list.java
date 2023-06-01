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
        if(head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode preserveEven = null;
        
        ListNode prev = head;
        ListNode curr = head.next;
        int flag = 1;
        
        while(curr != null && curr.next != null){
            
            if(flag == 1){
                preserveEven = curr;
                flag = 0;
            }
            
            prev.next = curr.next;
            curr.next = curr.next.next;
            
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = preserveEven;
        
        return head;
    }
}