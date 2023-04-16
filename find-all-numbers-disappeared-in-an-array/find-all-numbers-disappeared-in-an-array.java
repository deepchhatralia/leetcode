class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length+1);
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            hs.add(nums[i]);
        }
        
        for(int i = 1 ; i <= nums.length ; i++){
            if(!hs.contains(i))
                list.add(i);
        }
        return list;
            
            
            
//         int arr[] = new int[nums.length+1];
        
//         for(int i = 0 ; i < nums.length ; i++){
//             arr[nums[i]] = -1;
//         }
//         for(int i = 1 ; i < arr.length ; i++){
//             if(arr[i] != -1)
//                 list.add(i);
//         }
        
//         return list;
    }
}