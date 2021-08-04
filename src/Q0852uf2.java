public class Q0852uf2 {
    public int peakIndexInMountainArray(int[] arr) {
        //O(n)
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
}
