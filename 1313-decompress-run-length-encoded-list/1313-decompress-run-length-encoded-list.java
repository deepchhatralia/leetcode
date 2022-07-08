class Solution {
    public int[] decompressRLElist(int[] nums) {
        int counter = -1;
        int length = 0;
        
        for(int i = 0 ; i < nums.length ; i+=2){
            length += nums[i];
        }
        
        int arr[] = new int[length];
        
        for(int i = 0 ; i < nums.length ; i+=2){
            for(int j = 0 ; j < nums[i] ; j++){
                arr[++counter] = nums[i+1];
            }
        }
        return arr;
    }
}