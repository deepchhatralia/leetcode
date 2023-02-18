class Solution {
    public int[] replaceElements(int[] arr) {
        
        // brute force
        // for(int i = 0 ; i < arr.length ; i++){
        //     int max = -1;
        //     for(int j = i + 1 ; j < arr.length ; j++){
        //         if(arr[j] > max)
        //             max = arr[j];
        //     }
        //     arr[i] = max;
        // }
        
        int max = Integer.MIN_VALUE;
        
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            // if index is last than replace it with -1
            if(i == arr.length - 1){
                max = Math.max(max,arr[i]);
                arr[i] = -1;
                continue;
            }
            
            max = Math.max(max,arr[i + 1]);
            int temp = max;
            max = arr[i];
            arr[i] = temp;
        }
        
        //        17     18     5    4      6      1
        // arr[i] 18     6      6    6      1     -1
        // max    (6,18) (6,5) (6,4) (1,6) (1,-1) -1
        
        return arr;
    }
}