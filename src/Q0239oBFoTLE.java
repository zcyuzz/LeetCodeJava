public class Q0239oBFoTLE {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //brute force - TLE
//        if (k == 1) return nums;
//        int windows = nums.length - k + 1;
//        int[] result = new int[windows];
//        for (int i = 0; i < windows; i++) {
//            int max = -2147483648;
//            int end = i + k - 1;
//            for (int j = i; j <= end; j++) {
//                if (nums[j] > max) max = nums[j];
//            }
//            result[i] = max;
//        }
//        return result;
        if (k == 1) return nums;
        int windows = nums.length - k + 1;
        int[] result = new int[windows];
        int maxIndex = 0;
        for (int i = 0; i < windows; i++) {

        }


        return result;
    }
}