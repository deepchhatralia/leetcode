class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
  
        Arrays.sort(arr);
        
        if(arr.length % 2 != 0)
            return arr[arr.length/2];

        return (float)(arr[arr.length/2] + arr[(arr.length-1)/2]) / 2;
            
    }
}