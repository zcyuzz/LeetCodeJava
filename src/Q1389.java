import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        //convert to arraylist
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0 ;i<nums.length;i++){
            temp.add(index[i],nums[i]);
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=temp.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{0,1,2,3,4};
        int [] index = new int[]{0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
