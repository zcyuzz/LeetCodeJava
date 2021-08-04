import java.util.Arrays;

public class Q1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[i / 2];
            result[i + 1] = nums[i / 2 + n];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }
}
