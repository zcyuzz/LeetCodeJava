public class Q1920 {
    public static int[] buildArray(int[] nums) {
        //need extra space
        int [] result = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            result[i]=nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
