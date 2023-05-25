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
        
        
        
        // Brute force 2
        int len1 = 0, len2 = 0;
        
        while(first != null){
            len1 += 1;
            first = first.next;
        }
        first = headA;
        
        while(second != null){
            len2 += 1;
            second = second.next;
        }
        second = headB;
        
        int diff = Math.abs(len1 - len2);
        
        if(len1 > len2){
            for(int i = 0 ; i < diff ; i++){
                first = first.next;
            }
        }else{
            for(int i = 0 ; i < diff ; i++){
                second = second.next;
            }
        }
        
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
        
        
//         HashMap<ListNode,Integer> hm = new HashMap<>();
        
//         while(first != null){
//             hm.put(first,first.val);
            
//             first = first.next;
//         }
        
//         while(second != null){
//             if(hm.getOrDefault(second,0) != 0){
//                 return second;
//             }
//             second = second.next;
//         }
        
        
        
        
        
        
        // return null;
    }
}