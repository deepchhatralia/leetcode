class MyLinkedList {
    ListNode head;
    int size;
    
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        
        ListNode iterator = head;
        int count = 0;
        
        while(count != index){
            iterator = iterator.next;
            count++;
        }
        return iterator.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = null;
        
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        
        ListNode iterator = head;
        
        while(iterator.next != null){
            iterator = iterator.next;
        }
        iterator.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
            return;
        
        ListNode newNode = new ListNode(val);
        newNode.next = null;
        
        if(index == 0){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        
        int count = 0;
        ListNode prev = head;
        ListNode curr = head;
        
        while(count != index){
            prev = curr;
            curr = curr.next; // count will be on current
            count++;
        }
        newNode.next = curr;
        prev.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;
        
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        int count = 0;
        ListNode prev = head;
        ListNode curr = head;
        
        while(count != index){
            prev = curr;
            curr = curr.next; // count will be on current
            count++;
        }
        if(count == size-1){
            prev.next = null;
        }else{
            prev.next = curr.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */