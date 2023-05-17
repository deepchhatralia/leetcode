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
    public ListNode detectCycle(ListNode head) {
//         if(head == null) return null;
        
//         HashSet<ListNode> hs = new HashSet<>();
        
//         ListNode index = head;
        
//         while(index.next != null){
//             if(hs.contains(index))
//                 return index;
            
//             hs.add(index);
//             index = index.next;
//         }
//         return null;
        
        if(head == null || head.next == null) return null;
        
        if(head.next == head) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                ListNode index = head;
                
                while(index != slow){
                    slow = slow.next;
                    index = index.next;
                }
                return slow;
            }
        }
        return null;
    }
}