public class Q0053 {
    public static int maxSubArray(int[] nums) {
        int result = -100000;
        int temp = result;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i] >= nums[i] ? temp + nums[i] : nums[i];
            result = temp >= result ? temp : result;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
