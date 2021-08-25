public class Q1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (length == word1.length()) sb.append(word2.substring(length, word2.length()));
        else sb.append(word1.substring(length, word1.length()));
        return sb.toString();
    }
}
