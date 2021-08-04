import java.util.Arrays;

public class Q1313 {
    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            while (nums[i] > 0) {
                result[index++] = nums[i + 1];
                nums[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(temp)));
    }

}
