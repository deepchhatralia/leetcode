class Solution {
    public int[] shuffle(int[] nums, int mid) {
        int arr[] = new int[nums.length];
        int counter = -1;
        
        for(int i = 0 ; i < mid ; i++){
            arr[++counter] = nums[i];
            arr[++counter] = nums[mid+i];
        }
        return arr;
    }
}