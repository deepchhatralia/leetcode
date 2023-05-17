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
        // tortoise approach
        if(head == null || head.next == null)
            return false;
        
        if(head.next.next == head)
            return true;
        
//         ListNode slow = head;
//         ListNode fast = head;
//         int flag = 1;
        
//         while(flag == 1 || slow != fast){
//             if(fast == null || fast.next == null)
//                 return false;
            
//             flag = 0;
//             slow = slow.next;
//             fast = fast.next.next;
            
//         }
//         return true;
        
        
        HashMap<ListNode,Integer> hm = new HashMap<>();
        ListNode index = head;
        
        while(index.next != null){
            if(hm.getOrDefault(index,0) != 0)
                return true;
            
            hm.put(index, 1);
            index = index.next;
        }
        return false;
    }
}