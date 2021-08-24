public class Q1832 {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        for (char ch : sentence.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int i : count) {
            if (i == 0) return false;
        }
        return true;
    }
}
