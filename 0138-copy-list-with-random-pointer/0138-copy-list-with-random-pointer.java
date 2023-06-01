/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = new Node(0);
        
        Node result = temp;
        Node index = head;
        
        while(index != null){
            Node newNode = new Node(index.val);
            result.next = newNode;
            result = newNode;
            
            index = index.next;
        }
        
        index = head;
        result = temp.next;
        
        Node indexTemp = index;
        Node resultTemp = result;
        
        // link new linked list between the nodes of old linked list
        while(index != null){
            resultTemp = resultTemp.next;
            indexTemp = index.next;

            index.next = result;
            result.next = indexTemp;
            
            index = indexTemp;
            result = resultTemp;
        }
        
        index = head;
        
        // assign random pointers of new linked list
        while(index != null){
            if(index.random == null){
                index.next.random = index.random;
                index = index.next.next;
                continue;
            }
            index.next.random = index.random.next;
            index = index.next.next;
        }
        
        // update the next pointer to orignal 
        index = head;
        result = temp.next;
        while(index != null){
            index.next = result.next;
            // result.next = result.next.next;
            
            if(index.next == null){
                result.next = null;
                break;
            }
            
            result.next = index.next.next;
            
            index = index.next;
            result = result.next;
        }
        
        return temp.next;
    }
}