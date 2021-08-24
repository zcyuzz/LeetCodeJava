import com.sun.source.tree.ReturnTree;

public class Q0008uf {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean leadingWhiteSpace = true;
        boolean sign = false;
        boolean negative = false;
        boolean beforeNumber = true;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) break;
            if (c == '.') break;
            if (Character.isDigit(c)) {
                sb.append(c);
                sign = true;
            }
            if (leadingWhiteSpace == true && c == ' ') continue;
            else leadingWhiteSpace = false;
            if (c == ' ') break;
            if (sign == true && (c == '-' || c == '+')) break;
            if (sign == false && (c == '-' || c == '+')) {
                sign = true;
                if (c == '-') negative = true;
            }
        }
        if (sb.length() == 0) return 0;
        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        if (sb.length() > 10 && negative == true) return Integer.MIN_VALUE;
        if (sb.length() > 10 && negative == false) return Integer.MAX_VALUE;
        String temp = sb.toString();
        if (temp.length() == 0) return 0;
        if (negative == true) temp = "-" + temp;
        long l = Long.parseLong(temp);
        if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) l;
    }
}
