public class Q1021 {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                if (count != 1) sb.append(ch);
            } else if (ch == ')') {
                count--;
                if (count != 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
