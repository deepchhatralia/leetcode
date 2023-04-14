//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // int count = 0;
        
        // for(int i = 0 ; i < n ; i++){
        //     count = 0;
        //     for(int j = 0 ; j < n ; j++){
        //         if(list.contains(arr[i]))
        //             break;
                
        //         if(arr[i] == arr[j])
        //             count++;
        //     }
        //     if(count > n/3)
        //         list.add(arr[i]);
        // }
        
        
        
        // HashMap<Integer,Integer> hm = new HashMap<>();
        
        // for(int i = 0 ; i < n ; i++){
        //     hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        // }
        
        // for (int key : hm.keySet()) {
        //     if(hm.get(key) > (n / 3))
        //         list.add(key);
        // }
        
        
        
        int c1 = 0, c2 = 0, e1 = 0, e2 = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(c1 == 0 && e2 != arr[i]){
                c1 = 1;
                e1 = arr[i];
            }else if(c2 == 0 && e1 != arr[i]){
                c2 = 1;
                e2 = arr[i];
            }else if(arr[i] == e1){
                c1++;
            }else if(arr[i] == e2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0; c2 = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == e1)
                c1++;
            if(arr[i] == e2)
                c2++;
        }
        
        if(c1 > (n / 3))
            list.add(e1);
        if(c2 > (n / 3))
            list.add(e2);
            
        
        
        
        if(list.size() == 0)
            list.add(-1);
            
        return list;
    }
}
        
