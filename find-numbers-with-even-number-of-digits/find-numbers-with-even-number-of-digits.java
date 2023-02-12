class Solution {
    public int findNumbers(int[] nums) {
//         String str = "";
//         int sum = 0;
        
//         for(int i = 0 ; i < nums.length ; i++){
//             str = "" + nums[i];
            
//             if(str.length() % 2 == 0)
//                 sum++;
//         }
        
//         return sum;
        
        
        int sum = 0, ans = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i] >= 10){
                sum += 1;
                nums[i] /= 10;
            }
            sum += 1;
            
            if(sum % 2 == 0) ans++;
            
            sum = 0;
        }
        
        return ans;
    }
}