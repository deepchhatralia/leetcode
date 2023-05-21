class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        
        // for(int i = 0 ; i < len ; i++){
        //     int sum = 1;
        //     for(int j = i ; j < len ; j++){
        //         sum *= nums[j];
        //         max = Math.max(max, sum);
        //     }
        // }
        
        
        
        int prefix = 1, suffix = 1;
        
        for(int i = 0 ; i < len ; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            
            prefix *= nums[i];
            suffix *= nums[len - i - 1];
            
            max = Math.max(max, Math.max(prefix, suffix));
        }
        
        return max;
    }
}