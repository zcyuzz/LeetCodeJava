import java.util.ArrayList;
import java.util.List;

public class Q1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        k %= row * col;
        int[] oneD = new int[row * col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) oneD[col * i + j] = grid[i][j];
        }
        int[] oneDresult = new int[oneD.length];
        for (int i = 0; i < oneD.length; i++) {
            if (i < k) oneDresult[i] = oneD[oneD.length - (k - i)];
            else oneDresult[i] = oneD[i - k];
        }
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < col; j++) temp.add(oneDresult[i * col + j]);
            result.add(temp);
        }
        return result;
    }
}
