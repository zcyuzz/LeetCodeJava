public class Q1844 {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a') {
                sb.append(ch);
                continue;
            } else {
                sb.append((char) (s.charAt(i - 1) + (ch - '0')));
            }
        }
        return sb.toString();
    }
}
