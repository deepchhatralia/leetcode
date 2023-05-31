// class MyStack {
//     Queue<Integer> q1;
//     Queue<Integer> q2;
//     static int top;

//     public MyStack() {
//         q1 = new LinkedList<Integer>();
//         q2 = new LinkedList<Integer>();
//         top = -1;
//     }
    
//     public void push(int a) {
//         if(q1.size() != 0) q1.add(a);
//         else q2.add(a);
//         top = a;
//     }
    
//     public int pop() {
//         int temp = -1;   
        
//         if(q1.size() == 1) return q1.remove();
//         if(q2.size() == 1) return q2.remove();
        
// 	    if(q1.size() != 0){
// 	        temp = perform(q1, q2);
// 	    } else{
// 	        temp = perform(q2, q1);
// 	    }
// 	    return temp;
//     }

//     static int perform(Queue<Integer> a, Queue<Integer> b){
//         int val = -1;
//         while(!a.isEmpty()){
//             int temp = a.remove();
//             top = temp;
//             b.add(temp);
            
//             if(a.size() == 1){
//                 val = a.remove();
//                 break;
//             }
//         }
//         return val;
//     }
    
//     public int top() {
//         // Queue<Integer> tempQueue = new LinkedList<>();
//         // int val = -1;

//         // if(q1.size() > 0){
//         //     while(!q1.isEmpty()){
//         //         val = q1.remove();
//         //         tempQueue.add(val);
//         //     }
//         //     q1 = tempQueue;
//         // }else if(q2.size() > 0){
//         //     while(!q2.isEmpty()){
//         //         val = q2.remove();
//         //         tempQueue.add(val);
//         //     }
//         //     q2 = tempQueue;
//         // }
//         // return val;

//         return top;
//     }
    
//     public boolean empty() {
//         if(q1.size() == 0 && q2.size() == 0) return true;
//         return false;
//     }
// }


// using a single queue
class MyStack {
    Queue<Integer> q1;
    static int top;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        top = -1;
    }
    
    public void push(int a) {
        top = a;
        q1.add(a);
    }
    
    public int pop() {
        if(q1.size() == 0)
            return -1;
        
        for(int i = 0 ; i < q1.size()-1 ; i++){
            int temp = q1.remove();
            top = temp;
            q1.add(temp);
        }
        return q1.remove();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q1.size() == 0 ? true : false;
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */