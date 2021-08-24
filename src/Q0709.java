public class Q0709 {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ('A' <= ch && 'Z' >= ch) ch = (char) (ch + 32);
            sb.append(ch);
        }
        return sb.toString();
    }
}
