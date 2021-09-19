public class Q2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(word.substring(0, index + 1)).reverse().append(word.substring(index + 1, word.length()));
            return sb.toString();
        }
        return word;
        // one line solution
//        return word.indexOf(ch) >= 0 ?
//                new StringBuilder().append(word.substring(0, word.indexOf(ch) + 1)).reverse().append(word.substring(word.indexOf(ch) + 1, word.length())).toString() : word;
    }
}
