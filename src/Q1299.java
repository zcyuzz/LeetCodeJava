

public class Q1299 {
    public int[] replaceElements(int[] arr) {
        //starting from back
        int[] result = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i++) {
            result[i] = max;
            max = arr[i] > max ? arr[i] : max;
        }
        return result;
        //brute force
//        if (arr.length == 1) return new int[]{-1};
//        int max = 0;
//        int length = arr.length;
//        int[] result = new int[length];
//        for (int i = 0; i < length - 1; i++) {
//            if (i < max) {
//                result[i] = arr[max];
//                continue;
//            }
//            max = i + 1;
//            for (int j = i + 1; j < length; j++) {
//                if (arr[j] > arr[max]) max = j;
//            }
//            result[i] = arr[max];
//        }
//        result[length - 1] = -1;
//        return result;
    }
}
