class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] *= nums[i];
        }
        
        
        int low = 0, mid = 0, high = nums.length - 1;
        
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                }
            }
        }
        return nums;
            
    }
    
    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}