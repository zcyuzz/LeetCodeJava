import java.util.Arrays;

public class Q0977 {
    public int[] sortedSquares(int[] nums) {
        //brute force
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        ;
        Arrays.sort(nums);
        return nums;
    }
}
