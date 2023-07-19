class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0 ; i < nums1.length ; i++){
            boolean exist = false;
            int replace = -1;
            
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums2[j] == nums1[i]){
                    exist = true;
                }
                if(nums2[j] > nums1[i] && exist){
                    replace = nums2[j];
                    break;
                }
            }
            nums1[i] = replace;
        }
        return nums1;
    }
}