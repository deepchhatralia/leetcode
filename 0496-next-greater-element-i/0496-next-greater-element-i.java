class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0 ; i < nums1.length ; i++){
            boolean startRecord = false;
            int replaceValue = -1;
            
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums2[j] == nums1[i])
                    startRecord = true;
                
                if(nums2[j] > nums1[i] && startRecord){
                    replaceValue = nums2[j];
                    break;
                }
            }
            nums1[i] = replaceValue;
        }
        return nums1;
    }
}