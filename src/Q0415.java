public class Q0415 {
    public String addStrings(String num1, String num2) {
        int length1 = Math.min(num1.length(), num2.length());
        int length2 = Math.max(num1.length(), num2.length());
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < length1; i++) {
            int x = num1.charAt(i) - '0';
            int y = num2.charAt(i) - '0';
            if (x + y + carry > 10) {
                sb.append(x + y + carry - 10);
                carry = 1;
            } else {
                sb.append(x + y);
                carry = 0;
            }
        }
        return sb.reverse().toString();
    }
}
