class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1)
            return nums;
        
        int even = 0, odd = nums.length - 1;
        
        while(even < odd){
            if(nums[even] % 2 == 0)
                even++;
            else if(nums[odd] % 2 != 0)
                odd--;
            else if(nums[even] % 2 != 0){
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd--;
            } else if(nums[odd] % 2 == 0){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even++;
            }
        }
        return nums;
    }
}