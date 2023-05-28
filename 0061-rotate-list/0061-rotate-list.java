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
    // 1ms 83.25% 43.25mb 
    public static int getSize(ListNode headNode){
        int count = 0;
        while(headNode != null){
            count++;
            headNode = headNode.next;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) { 
        if(head == null || head.next == null) return head;
        
        // int temp = k%getSize(head);
        
        // for(int i = 0 ; i < temp ; i++){
        //     ListNode prev = null;
        //     ListNode curr = head;
            
        //     while(curr.next != null){
        //         prev = curr;
        //         curr = curr.next;
        //     }
        //     prev.next = null;
        //     curr.next = head;
        //     head = curr;
        // }
        // return head;

        
        k = k % getSize(head);
        k = getSize(head) - k;
        
        if(k == 0)
            return head;
        
        int count = 1;
        
        ListNode ptr = head, preserve = null;
        
        while(ptr.next != null){
            if(count == k){
                preserve = ptr.next;
                ptr.next = null;
                ptr = preserve;
            }else{
                ptr = ptr.next;
            }
            count++;
        }
        if(preserve != null){
            ptr.next = head;
        }
        if(preserve == null){
            return head;
        }
        
        return preserve;
    }
}