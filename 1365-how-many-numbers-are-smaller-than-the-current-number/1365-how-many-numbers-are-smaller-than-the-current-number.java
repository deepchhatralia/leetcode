class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){
            int counter = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] < nums[i]){
                    counter++;
                }
            }
            arr[i] = counter;
        }
        return arr;
    }
}