public class Q0541uf2 {
    public String reverseStr(String s, int k) {
        int temp = s.length(), length = s.length();
        StringBuilder sb = new StringBuilder();
        if (temp >= 2 * k) {
            for (int i = 0; i < length - length % (2 * k); i += 2 * k) {
                for (int j = k - 1; j >= 0; j--) sb.append(s.charAt(i + j));
                for (int j = i + k; j < i + 2 * k; j++) sb.append(s.charAt(j));
                temp -= 2 * k;
            }
        }
        if (temp <= k) {
            for (int i = length - 1; i >= length - temp; i--) sb.append(s.charAt(i));
        } else {
            for (int i = length - length % k - 1; i >= s.length() - temp; i--) sb.append(s.charAt(i));
            for (int i = length - length % k; i < s.length(); i++) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}


