public class Q0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int result = nums.length;
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result--;
                continue;
            }
            temp[index++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) nums[i] = temp[i];
        return result;
    }
}
