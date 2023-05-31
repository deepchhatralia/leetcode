// class MyQueue {
//     Stack<Integer> input;
//     Stack<Integer> output; 

//     public MyQueue() {
//         input = new Stack<Integer>(); 
//         output = new Stack<Integer>();
//     }
    
//     public void push(int x) {
//         input.push(x);
//     }
    
//     public int pop() {
//         int val = -1;
        
// 	    while(!input.isEmpty()){
//             val = input.pop();
            
//             if(input.size() == 0) break;
            
//             output.push(val);
//         }
//         while(!output.isEmpty()){
//             input.push(output.pop());
//         }
	    
// 	    return val;
//     }
    
//     public int peek() {
//         if(input.isEmpty()) return -1;

//         int val = -1;

//         while(!input.isEmpty()){
//             val = input.pop();

//             output.push(val);
//         }
//         while(!output.isEmpty()){
//             input.push(output.pop());
//         }
//         return val;
//     }
    
//     public boolean empty() {
//         return input.isEmpty();
//     }
// }




// optimized
class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output; 

    public MyQueue() {
        input = new Stack<Integer>(); 
        output = new Stack<Integer>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(!output.isEmpty())
            return output.pop();
        
        if(input.isEmpty())
            return -1;
        
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.pop();
    }
    
    public int peek() {
        if(!output.isEmpty())
            return output.peek();
        
        if(input.isEmpty())
            return -1;
        
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty() ? true : false;
    }
}



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */