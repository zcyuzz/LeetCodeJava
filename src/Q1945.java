public class Q1945 {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) sb.append(ch - 'a' + 1);
        String str = sb.toString();
        for (int i = 0; i < k; i++) str = sumOfDigits(str);
        return Integer.valueOf(str);
    }

    public String sumOfDigits(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) sum += ch - '0';
        return String.valueOf(sum);
    }
}
