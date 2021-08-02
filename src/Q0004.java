public class Q0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i = 0; //index of nums1
        int j = 0; //index of nums2
        int k = 0; //index of merged
        int merged[] = new int[nums1.length + nums2.length];
        while (k < merged.length && i < length1 && j < length2) {
            merged[k] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
            k++;
        }
        while (i < length1) merged[k++] = nums1[i++];
        while (j < length2) merged[k++] = nums2[j++];
        if (merged.length % 2 == 0) result = (double) (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;
        else result = (double) merged[merged.length / 2];
        return result;
    }
}
