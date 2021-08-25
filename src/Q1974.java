public class Q1974 {
    public int minTimeToType(String word) {
        //type word.length() amount of characters.
        int result = word.length();
        result += Math.min(Math.abs(word.charAt(0) - 'a'), 26 - Math.abs((word.charAt(0) - 'a')));
        for (int i = 1; i < word.length(); i++) {
            char current = word.charAt(i);
            char previous = word.charAt(i - 1);
            result += Math.min(Math.abs(current - previous), 26 - Math.abs((previous - current)));
        }
        return result;
    }
}
