import java.util.ArrayList;
import java.util.List;

public class Q1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int minInColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][minInColumn]) minInColumn = j;
            }
            boolean maxInRow = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minInColumn] > matrix[i][minInColumn]) maxInRow = false;
            }
            if (maxInRow == true) result.add(matrix[i][minInColumn]);
        }
        return result;
    }
}

