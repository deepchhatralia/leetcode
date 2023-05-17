/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        
        if(head.next.next == head)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        int flag = 1;
        
        while(flag == 1 || slow != fast){
            if(fast == null || fast.next == null)
                return false;
            
            flag = 0;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return true;
    }
}