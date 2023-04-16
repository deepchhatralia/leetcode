class Solution {
    public int dominantIndex(int[] nums) {
        int index = -1, largest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > largest){
                largest = nums[i];
                index = i;
            }
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            if((nums[i] * 2) > largest && i != index)
                return -1;
        }
        return index;
    }
}