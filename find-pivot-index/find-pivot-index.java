class Solution {
    public int pivotIndex(int[] arr) {
//         int rightSum[] = new int[arr.length];
//         rightSum[arr.length-1] = arr[arr.length-1];
        
//         int leftSum[] = new int[arr.length];
//         leftSum[0] = arr[0];
        
//         for(int i = 1 ; i < arr.length ; i++){
//             leftSum[i] = leftSum[i-1] + arr[i];
//         }
//         for(int i = arr.length-2 ; i >= 0 ; i--){
//             rightSum[i] = rightSum[i+1] + arr[i];
//         }
//         for(int i = 0 ; i < arr.length ; i++){
//             if(leftSum[i] == rightSum[i])
//                 return i;
//         }
//         return -1;
        
        int leftSum = 0, sum = 0;
        
        for(int x : arr){
            sum += x;
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(leftSum == (sum - leftSum - arr[i]))
                return i;
            
            leftSum += arr[i];
        }
        return -1;
    }
}