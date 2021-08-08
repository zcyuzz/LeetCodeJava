public class Q1089 {
    public void duplicateZeros(int[] arr) {
        //two pointer Time: O(n) Space: O(n)
        int i = 0, j = 0;
        for (; i < arr.length; i++, j++) {
            if (arr[j] == 0) i++;
        }


        //extra n space Time: O(n) Space: O(n)
//        int[] temp = new int[arr.length];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[index];
//            if (arr[index] == 0 && i != arr.length - 1) temp[i++] = 0;
//            index++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = temp[i];
//        }
        //brute force Time: O(n^2) Space: O(n)
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                shift(arr, i + 1);
//                if (i < arr.length -1) {
//                    arr[++i] = 0;
//                }
//            }
//        }
    }

    public void shift(int[] arr, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }
}
