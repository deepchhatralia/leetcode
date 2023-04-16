class Solution {
    public int dominantIndex(int[] nums) {
//         int index = -1, largest = Integer.MIN_VALUE;
        
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] > largest){
//                 largest = nums[i];
//                 index = i;
//             }
//         }
        
//         for(int i = 0 ; i < nums.length ; i++){
//             if((nums[i] * 2) > largest && i != index)
//                 return -1;
//         }
//         return index;
        
        
        
       
       int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, index = -1;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > first){
                index = i;
                second = first;
                first = nums[i];
            } else if(nums[i] > second)
                second = nums[i];
        }
        if(second * 2 > first)
            return -1;
    
        return index;
    }
}