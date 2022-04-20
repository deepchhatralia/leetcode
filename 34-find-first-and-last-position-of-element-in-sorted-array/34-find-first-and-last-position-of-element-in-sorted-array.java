class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        boolean flag = false;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                end = i;
            }
            if(nums[i] == target && !flag){
                start = i;
                flag = true;
            }
        }
        
        int[] output = {start,end};
        return output;
    }
}