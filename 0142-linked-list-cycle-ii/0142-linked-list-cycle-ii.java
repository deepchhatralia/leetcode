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
        if(head == null) return null;
        
        HashSet<ListNode> hs = new HashSet<>();
        
        ListNode index = head;
        
        while(index.next != null){
            if(hs.contains(index))
                return index;
            
            hs.add(index);
            index = index.next;
        }
        return null;
    }
}