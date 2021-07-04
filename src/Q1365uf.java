import java.util.Arrays;

public class Q1365uf {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // Brute force
//        int[] result = new int[nums.length];
//        for(int i = 0; i<nums.length;i++){
//            for(int j = 0; j<nums.length;j++){
//                if(nums[i]>nums[j]) result[i]++;
//            }
//        }
//        return result;
        //Sorted array-unfinished
        int[] result = new int[nums.length];
        int[]  smallerNumbers = new int[101];
        for(int i =0;i<nums.length;i++){
            smallerNumbers[nums[i]+1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
}
