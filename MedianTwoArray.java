public class MedianTwoArray {
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] mergearray = new int[m+n];

        int i=0, j=0,k=0;
        for(;i<m && j<n;k++){

            if(nums1[i] <= nums2[j]){
                mergearray[k] = nums1[i++];
            }
            else{
                mergearray[k] = nums2[j++];
            }
        }
        for (; i < m; i++, k++) {
            mergearray[k] = nums1[i];
        }

        // Copy remaining elements from the second array, if any
        for (; j < n; j++, k++) {
            mergearray[k] = nums2[j];
        }

        
        return mergearray;
        // return 0.0;
    }
    public static void main(String[] args) {
        
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        int[] mergedArray = findMedianSortedArrays(nums1, nums2);

        int l = mergedArray.length;
        double median = 0;
        // System.out.print("Mrged Array: ");
        for (int i = 0; i < l; i++) {
            if(mergedArray.length % 2 == 0){
                double m = mergedArray[l/2]+mergedArray[(l/2)-1];
                 median = m/2;
            }
            else{
                 median = mergedArray[l/2];
            }
        }
        System.out.println(median);
        
    }
    
}
