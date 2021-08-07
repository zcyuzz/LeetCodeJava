

public class Q0977 {
    public int[] sortedSquares(int[] nums) {
        //two pointer
        if (nums.length == 1) return new int[]{nums[0] * nums[0]};
        int[] temp = new int[nums.length];
        int i = 0, j = nums.length - 1;
        int index = 0;
        while (i != j) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                temp[index++] = nums[i] * nums[i];
                i++;
            } else {
                temp[index++] = nums[j] * nums[j];
                j--;
            }
        }
        temp[nums.length - 1] = nums[i] * nums[i];
        for (int k = 0; k < nums.length; k++) {
            nums[k] = temp[temp.length - k - 1];
        }
        return nums;
        //brute force
//        for(int i =0;i<nums.length;i++){
//            nums[i]=nums[i]*nums[i];
//        };
//        Arrays.sort(nums);
//        return nums;
    }
}
