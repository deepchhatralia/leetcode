//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int ans[] = {-1,-1};
        
        // for(int i = 1 ; i <= n ; i++){
        //     int count = 0;
        //     for(int j = 0 ; j < n ; j++){
        //         if(arr[j] == i) count++;
        //     }
        //     if(count == 2) ans[0] = i;
        //     if(count == 0) ans[1] = i;
        //     if(ans[0] != -1 && ans[1] != -1) break;
        // }
        
        
        
        int hash[] = new int[n+1];
        Arrays.fill(hash,0);
        
        for(int i = 0 ; i < n ; i++){
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        
        for(int i = 1 ; i <= n ; i++){
            if(hash[i] > 1) ans[0] = i;
            if(hash[i] == 0) ans[1] = i;
            
            if(ans[0] != -1 && ans[1] != -1) break;
        }
        
        return ans;
    }
}