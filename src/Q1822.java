public class Q1822 {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) negativeCount++;
        }
        if (negativeCount % 2 == 1) return -1;
        return 1;
    }
}
