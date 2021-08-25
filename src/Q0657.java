public class Q0657 {
    public boolean judgeCircle(String moves) {
        int UD = 0, LR = 0;
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    UD++;
                    break;
                case 'D':
                    UD--;
                    break;
                case 'L':
                    LR--;
                    break;
                case 'R':
                    LR++;
                    break;
            }
        }
        return UD == 0 && LR == 0 ? true : false;
    }
}
