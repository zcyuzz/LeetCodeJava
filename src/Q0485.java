public class Q0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) temp++;
            else temp = 0;
            if (temp > result) result = temp;
        }
        return result;
    }
}
