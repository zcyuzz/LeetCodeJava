public class Q1295 {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            while (nums[i] > 0) {
                temp++;
                nums[i] /= 10;
            }
            if (temp % 2 == 0) result++;
        }
        return result;
    }
}
