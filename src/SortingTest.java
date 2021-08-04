import java.util.HashMap;

public class SortingTest {
    public static void main(String[] args) {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace('[', '{');
        s = s.replace(']', '}');
        System.out.println(s);
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(3, 0);
        a.put(3, 1);
        System.out.println(a);
        System.out.println(9 % 10);
        System.out.println(9 / 10);


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

    public static void bubbleSort(int[] nums) {

    }
}


