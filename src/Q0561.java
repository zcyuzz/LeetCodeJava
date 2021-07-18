import java.util.Arrays;

public class Q0561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i =0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] temp = new int[]{1,4,3,2};
        System.out.println(arrayPairSum(temp));
    }
}
