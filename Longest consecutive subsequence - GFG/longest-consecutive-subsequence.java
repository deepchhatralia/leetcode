//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   //int longest = 1;
	   
	   //for(int i = 0 ; i < N ; i++){
	   //     int count = 1;
	   //     int curr = arr[i];
	   //     int next = curr + 1;
	   //     boolean found = false;
	   //     int j = 0;
	        
	   //     while(found == false && j < N){
	   //         if(arr[j] == next){
	   //             count++;
	   //             found = true;
	   //         }
	   //         j++;
	   //     }
	   //}
	   
	   Arrays.sort(arr);
	   int longest = 1;
	   int count = 1;
	   
	   for(int i = 1 ; i < N ; i++){
	       if(arr[i] - arr[i - 1] == 1){
	           count++;
	       }else if(arr[i] - arr[i - 1] == 0){
	           continue;
	       }else{
	           count = 1;
	       }
	       longest = Math.max(longest, count);
	   }
	   return longest;
	   
	}
}