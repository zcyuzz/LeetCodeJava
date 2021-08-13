public class Q0941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length == 1) return false;
        if (arr[1] <= arr[0]) return false;
        int index = 0;
        for (int i = 1; i < arr.length; i++) if (arr[i] == arr[i - 1]) return false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < arr.length; i++) if (arr[i] >= arr[i - 1]) return false;
        return true;
    }
}
