public class Q1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToInt(firstWord) + stringToInt(secondWord) == stringToInt(targetWord);
    }

    public int stringToInt(String s) {
        int result = 0;
        for (char ch : s.toCharArray()) {
            result *= 10;
            result += ch - 'a';
        }
        return result;
    }
}
