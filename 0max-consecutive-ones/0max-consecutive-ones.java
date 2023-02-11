class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            
            max = Math.max(max,sum);
            
            if(nums[i] == 0){
                sum = 0;
            }
        }
        return max;
    }
}