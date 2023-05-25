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
        ListNode first = headA;
        ListNode second = headB;
        
        
        // Brute force
//         while(first != null){
//             while(second != null){
//                 if(first == second)
//                     return first;
                
//                 second = second.next;
//             }
//             second = headB;
//             first = first.next;
//         }
        
        HashMap<ListNode,Integer> hm = new HashMap<>();
        
        while(first != null){
            hm.put(first,first.val);
            
            first = first.next;
        }
        
        while(second != null){
            if(hm.getOrDefault(second,0) != 0){
                return second;
            }
            second = second.next;
        }
        
        
        
        return null;
    }
}