

public class Q912SortArray1 {
    public static void main(String[] args) {
        //generate random int array
        int[] random = new int[50000];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 50000);
        }
//        Selection Sort
        long start = System.currentTimeMillis();
        selectionSortArray(random.clone());
        long end = System.currentTimeMillis();
        System.out.println("Selection sort: " + (end - start) + "ms");
//        Bubble Sort
        start = System.currentTimeMillis();
        bubbleSortArray(random.clone());
        end = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (end - start) + "ms");
//        Insertion Sort
        start = System.currentTimeMillis();
        insertionSortArray(random.clone());
        end = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (end - start) + "ms");
    }

    //insertion sort
    public static int[] insertionSortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    //bubble sort
    public static int[] bubbleSortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    //selection sort
    public static int[] selectionSortArray(int[] nums) {
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
        return nums;
    }


}
