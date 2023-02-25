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
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // If order does not matter than we can use 2 pointer approach
        
        // int low = 0 , high = arr.length - 1;
        
        // while(low <= high){
        //     if(arr[low] < 0){
        //         swap(arr, low, high);
        //         high--;
        //     }else{
        //         low++;
        //     }
        // }
        
        
        // if order matters than store the negative elements into another array
        
        int array[] = new int[n];
        int j = 0, k = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= 0){
                arr[j++] = arr[i];
            }else{
                array[k++] = arr[i];
            }
        }   
        
        for(int l = 0 ; l < k ; l++){
            arr[l + j] = array[l];
        }
        
    }
    
    // public static void swap(int arr[], int low, int high){
    //     int temp = arr[low];
    //     arr[low] = arr[high];
    //     arr[high] = temp;
    // }
}