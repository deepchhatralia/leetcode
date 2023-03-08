//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        //  int max = -1, sum = 0, sum2 = 0;

        // for(int i = 0 ; i < A.length ; i++){
        //     if(A[i] > max)
        //         max = A[i];

        //     sum += A[i];
        // }
    
        // for(int i = 1 ; i <= max ; i++){
        //     sum2 += i;
        // }

        // return sum2 - sum == 0 ? max + 1 : sum2 - sum;
        
        int expected = (N * (N + 1)) / 2;
        int actual = 0;
        
        for(int i = 0 ; i < N ; i++){
            actual += A[i];
        }
        
        return expected - actual == 0 ? N + 1 : expected - actual;
    }
}