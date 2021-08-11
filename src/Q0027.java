public class Q0027 {
    public int removeElement(int[] nums, int val) {
        //without extra space
        int result = nums.length;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result--;
                continue;
            }
            nums[index++] = nums[i];
        }
        return result;
        //extra array
//        int result = nums.length;
//        int[] temp = new int[result];
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) temp[index++] = nums[i];
//            else result--;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = temp[i];
//        }
//        return result;
    }
}
