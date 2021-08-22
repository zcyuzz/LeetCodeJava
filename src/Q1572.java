public class Q1572 {
    public int diagonalSum(int[][] mat) {
        int result = 0, length = mat.length;
        for (int i = 0; i < length; i++) {
            result += mat[i][i];
            result += mat[i][length - 1 - i];
        }
        if (length % 2 != 0) result -= mat[length / 2][length / 2];
        return result;
    }
}
