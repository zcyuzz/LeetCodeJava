public class Q1304 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
        }
        result[n - 1] = -(n - 1) * n / 2;
        return result;
    }
}
