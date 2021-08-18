import java.util.HashSet;

public class Q1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) count[arr[i] + 1000]++;
        for (int i = 0; i < 2001; i++) {
            if (count[i] != 0) {
                if (set.contains(count[i])) return false;
                set.add(count[i]);
            }
        }
        return true;
    }
}
