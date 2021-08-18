public class Q1816 {
    public String truncateSentence(String s, int k) {
        int space = 0, index = 0;
        for (int i = 0; i < s.length() && space < k; i++) {
            if (s.charAt(i) == ' ') {
                space++;
                index = i;
            }
        }
        if (space < k) return s;
        return s.substring(0, index);


        // trim string by space
//        String[] str = s.split("\\s+");
//        String result = "";
//        for (int i = 0; i < str.length && i < k; i++) {
//            result += str[i] + " ";
//        }
//        return result.substring(0, result.length() - 1);
    }
}
