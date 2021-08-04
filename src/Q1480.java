import java.util.Arrays;

public class Q1480 {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = temp + nums[i];
            temp = result[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }
}