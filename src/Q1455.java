public class Q1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        for (int i = 0; i < strs.length; i++) {
            int length = searchWord.length();
            if (strs[i].length() < length) continue;
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == searchWord.charAt(j)) {
                    length--;
                    if (length == 0) return i + 1;
                } else break;
            }
        }
        return -1;
    }
}
