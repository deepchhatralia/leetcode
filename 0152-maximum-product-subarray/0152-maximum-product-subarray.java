class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        
        for(int i = 0 ; i < len ; i++){
            int sum = 1;
            for(int j = i ; j < len ; j++){
                sum *= nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}