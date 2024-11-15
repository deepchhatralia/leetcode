//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
        //  Node one = head;
        //  Node two = head;
         
        //  while(two.next != null && two != null){
        //      one = one.next;
             
        //      if(two.next.next == null){
        //          two = two.next;
        //      }else{
        //          two = two.next.next;
        //      }
        //  }
        //  return one.data;
        
        
        
        Node index = head;
        int counter = 0;
        Node mid = head;
        
        while(index != null){
            if(counter % 2 != 0){
                mid = mid.next;
            }
            counter++;
            index = index.next;
        }
        return mid.data;
    }
}
