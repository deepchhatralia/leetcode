class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0 ; i < nums.length-1 ; i++){
        //     for(int j = i + 1 ; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{0,0};


        // HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int i = 0 ; i < nums.length ; i++){
        //     int x = hm.getOrDefault(target - nums[i], -1);
        //     if(x != -1){
        //         return new int[]{i,hm.get(target - nums[i])};
        //     }
        //     hm.put(nums[i],i);
        // }
        // return new int[]{0,0};

    

//         Arrays.sort(nums);
//         int left = 0, right = nums.length-1;

//         while(left < right){
//             int sum = nums[left] + nums[right];

//             if(sum == target) {
//                 return new int[]{left, right};
//             } else if(sum < target)
//                 left++;
//             else
//                 right--;
//         }

//         return new int[]{0,0};
        
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}