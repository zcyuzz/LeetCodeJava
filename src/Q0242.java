public class Q0242 {
    public boolean isAnagram(String s, String t) {
        // count character frequency for both string, 26 for lowercase letter
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (char ch : s.toCharArray()) {
            sCount[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            tCount[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) return false;
        }
        return true;
    }
}
