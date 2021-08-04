public class Q0420uf {
    public static int strongPasswordChecker(String password) {
        int result = 0;
        int length = password.length();
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        for (int i = 0; i < length; i++) {
            int repeat = 1;
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) repeat++;
                else break;
            }
            result += repeat > 2 ? repeat - 2 : 0;
            i += repeat - 1;
        }
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) upper = true;
            else if (Character.isDigit(c)) digit = true;
        }
        int lengthAfterRemoveDuplicate = result;
        if (length - result > 20) result += length - result - 20;
        if (length < 6) result += 6 - length;
        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaabbbbbbbbbbbbbbb";//answer is 16 for this case
        System.out.println(s.length());
        System.out.println(strongPasswordChecker(s));
    }

}
