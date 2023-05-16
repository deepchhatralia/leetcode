//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        if(q1.size() != 0) q1.add(a);
        else q2.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        if(q1.size() == 1){
            return q1.remove();
        }
        if(q2.size() == 1){
            return q2.remove();
        }
	    if(q1.size() != 0){
	        while(!q1.isEmpty()){
	            int temp = q1.remove();
	            q2.add(temp);
	            
	            if(q1.size() == 1){
	                return q1.remove();
	            }
	        }
	    } else{
	        while(!q2.isEmpty()){
	            int temp = q2.remove();
	            q1.add(temp);
	            
	            if(q2.size() == 1){
	                return q2.remove();
	            }
	        }
	    }
	    return -1;
    }
	
}

