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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode newHead = null;
        ListNode latest = null;
        
        while(list1 != null && list2 != null){
            ListNode newNode;
            if(list1.val <= list2.val){
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                newNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            
            if(newHead == null){
                newHead = newNode;
            }else{
                latest.next = newNode;
            }
            latest = newNode;
        }
        
        while(list1 != null){
            ListNode newNode = new ListNode(list1.val);
            latest.next = newNode;
            latest = newNode;
            list1 = list1.next;
        }
        while(list2 != null){
            ListNode newNode = new ListNode(list2.val);
            latest.next = newNode;
            latest = newNode;
            list2 = list2.next;
        }
        
        return newHead;
    }
}