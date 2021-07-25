import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int[] nums = new int[100000];
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            nums[i] = (int) (Math.random() * 100000);
        }
        long end1 = System.nanoTime();
        selectionSort(nums);
        long end2 = System.nanoTime();
        System.out.println(Arrays.toString(nums));
        System.out.println(end1-start);
        System.out.println(end2 - end1);
    }

    public static void selectionSort(int[] nums) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
    public static void bubbleSort(int [] nums){

    }
}


