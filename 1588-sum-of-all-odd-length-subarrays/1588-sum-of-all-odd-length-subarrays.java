class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int val[] = new int[arr.length / 2 + 1];
        
        for(int i = 1 ; i <= arr.length ; i+=2){
            val[(i-1)/2] = i;
        }
        
        for(int i = 0 ; i < val.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){ 
                for(int k = 0 ; k < val[i] ; k++){ 
                    if(j <= arr.length - val[i])
                        sum += arr[j+k];
                }
            }
        }
        
        return sum;
    }
}