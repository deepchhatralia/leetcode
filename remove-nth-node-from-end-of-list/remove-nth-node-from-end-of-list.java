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
    ListNode mainHead;
    
//     public int getSize(ListNode head){
//         ListNode index = head;
//         int count = 0;
        
//         while(index != null){
//             count++;
//             index = index.next;
//         }
//         return count;
//     }
    
    public ListNode removeNthFromEnd(ListNode head, int n){
        
        
//         int count = 0, size = getSize(head);
//         if(size == n){
//             head = head.next;
//             return head;
//         }
        
//         ListNode prev = null;
//         ListNode curr = head;
        
//         while(size-count != n){
//             count++; // 1 2 3
//             prev = curr; // 1 2 3
//             curr = curr.next; // 2 3 4
//         }
//         prev.next = curr.next;
//         return head;
        
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for(int i = 1 ; i <= n ; i++)
            fast = fast.next;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        if(slow == dummy){
            return head.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}