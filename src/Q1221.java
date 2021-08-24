public class Q1221 {
    public int balancedStringSplit(String s) {
        int result = 0, countL = 0, countR = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') countL++;
            else countR++;
            if (countL == countR) {
                result++;
                countL = countR = 0;
            }
        }
        return result;
    }
}
