public class Q1351 {
    public int countNegatives(int[][] grid) {
        //Time: O(m+n)
        int result = 0;
        int index = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = index; j < grid[i].length; j++) {
                if (grid[i][j] >= 0) index++;
                else {
                    result += grid[i].length - j;
                    break;
                }
            }
        }
        return result;
        //brute force Time: O(m * n)
//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] < 0) result++;
//            }
//        }
//        return result;
    }
}
