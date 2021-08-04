import java.util.Arrays;

public class Q1913 {
    public int maxProductDifference(int[] nums) {
        //use Array sort
        Arrays.sort(nums);
        int result = nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
        return result;
    }
}
