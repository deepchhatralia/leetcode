class Solution {
    public int[] decompressRLElist(int[] nums) {
        int counter = -1;
        List<Integer> lst = new ArrayList<Integer>();
        
        for(int i = 0 ; i < nums.length ; i+=2){
            for(int j = 0 ; j < nums[i] ; j++){
                lst.add(nums[i+1]);
                // arr[++counter] = nums[i+1];
            }
        }
        
        int[] arr = new int[lst.size()];
 
        for (int i = 0; i < lst.size(); i++)
            arr[i] = lst.get(i);
        
        return arr;
    }
}