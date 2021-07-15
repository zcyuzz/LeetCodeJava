import java.util.Arrays;

public class Q0791 {
    public static String customSortString(String order, String str) {
        String result = "";
        char temp = 'a';
        int[] charCount = new int[26];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i) - 97]++;
        }
        for (int i = 0; i < order.length(); i++) {
            temp = order.charAt(i);
            for (int j = 0; j < charCount[temp - 97]; j++) {
                result += temp;
            }
            charCount[temp - 97] = 0;
        }
        for (int i = 0; i < charCount.length; i++) {
            for (int j = 0; j < charCount[i]; j++) {
                result += (char) (i + 97);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String order = "cbafg";
        String str = "abcd";
        System.out.println(customSortString(order, str));
    }
}
