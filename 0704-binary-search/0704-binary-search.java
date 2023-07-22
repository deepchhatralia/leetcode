class Solution {
    // recursion
    public int bs(int arr[], int left, int right, int target){
        if(left > right)
            return -1;
        
        int mid = (left + right) / 2;
        
        if(arr[mid] == target)
            return mid;
        
        if(arr[mid] < target)
            return bs(arr, mid + 1, right, target);
        else
            return bs(arr, left, mid - 1, target);
    }
    
    public int search(int[] arr, int k) {
        return bs(arr,0, arr.length - 1, k);
//         if(arr.length == 1 && arr[0] == k) return 0;

//         int n = arr.length;
//         int left = 0,mid = n/2 , right = n-1;
        
//         while(left <= right){
//             if(arr[mid] == k)
//                 return mid;
//             else if(k < arr[mid])
//                 right = mid - 1;
//             else 
//                 left = mid + 1;
                
//             mid = (left + right) / 2;
//         }
        
//         return -1;
    }
}