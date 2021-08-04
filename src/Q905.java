public class Q905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int front = 0;
        int back = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) result[front++] = nums[i];
            else result[nums.length - back++ - 1] = nums[i];
        }
        return result;
    }
}
