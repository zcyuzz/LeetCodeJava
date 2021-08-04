public class Q1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // compare running sum of two string arrays
        String first = "";
        String second = "";
        for (String s : word1) {
            first += s;
        }
        for (String s : word2) {
            second += s;
        }
        return first.equals(second);
    }
}
