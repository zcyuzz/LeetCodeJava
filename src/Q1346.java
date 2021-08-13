import java.util.HashSet;

public class Q1346 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.contains(arr[i] * 2) || (nums.contains(arr[i] / 2) && arr[i] % 2 == 0)) return true;
            nums.add(arr[i]);
        }
        return false;
    }
}
