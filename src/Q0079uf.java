public class Q0079uf {
    public static boolean exist(char[][] board, String word) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int index = 0;
                if (board[i][j] == word.charAt(index++)) {
                    int row = i;
                    int col = j;
                    while (index < word.length()) {
                        System.out.println(index + "index");
                        System.out.println(word.charAt(index));
                        if (row > 0 && board[row - 1][col] == word.charAt(index)) {
                            System.out.println("down");
                            row--;
                            index++;
                            continue;
                        } else if (col > 0 && board[row][col - 1] == word.charAt(index)) {
                            System.out.println("left");
                            col--;
                            index++;
                            continue;
                        } else if (row < board.length - 1 && board[row + 1][col] == word.charAt(index)) {
                            System.out.println("up");
                            row++;
                            index++;
                            continue;
                        } else if (col < board[row].length - 1 && board[row][col + 1] == word.charAt(index)) {
                            System.out.println("right");
                            col++;
                            index++;
                            continue;
                        }
                        break;
                    }

                    System.out.println(index);
                }
                if (index == word.length()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] s = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(s, "SEE"));
    }
}
