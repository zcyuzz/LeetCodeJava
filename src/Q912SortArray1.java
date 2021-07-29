

public class Q912SortArray1 {
    public static void main(String[] args) {
        //generate random int array
        int [] random = new int[100000];
        for(int i =0;i<random.length;i++){
            random[i]= (int) (Math.random()*100000);
        }
        //Selection Sort
        long start = System.nanoTime();
        selectionSortArray(random.clone());
        long end = System.nanoTime();
        System.out.println("Selection sort: " + (end - start) + "ns");
        //Bubble Sort
        start = System.nanoTime();
        bubbleSortArray(random.clone());
        end = System.nanoTime();
        System.out.println("Bubble sort: " + (end - start) + "ns");
    }

    //bubble sort
    public static int[] bubbleSortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i-1; j++) {
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
