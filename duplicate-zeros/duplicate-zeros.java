class Solution {
    public void duplicateZeros(int[] arr) {
        int temp = -1;
        
        for(int i = 0 ; i < arr.length ; i++) {
            
            if(arr[i] == 0 && temp != i){
                
                for(int j = arr.length - 1 ; j > i ; j--){
                    arr[j] = arr[j - 1];
                }
                
                temp = i + 1;
            }
            
        }
    }
}