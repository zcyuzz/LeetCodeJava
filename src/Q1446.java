public class Q1446 {
    public int maxPower(String s) {
        if (s.length() == 1) return 1;
        int result = 0;
        int temp = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) temp++;
            else {
                if (temp > result) result = temp;
                temp = 1;
            }
        }
        if (temp > result) result = temp;
        return result;
    }
}
