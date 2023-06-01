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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode index = head.next;
        ListNode temp = head;
        temp.next = null;

        while(index != null){
            ListNode temp2 = index.next; // 3
            index.next = temp; // 2 -> 1
            temp = index;
            index = temp2;
        }
        head = temp;

        return head;
    }
}