public class Q1160 {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] count = new int[26];
        for (char ch : chars.toCharArray()) count[ch - 'a']++;
        for (String s : words) {
            boolean good = true;
            int[] temp = count.clone();
            for (char ch : s.toCharArray()) {
                if (--temp[ch - 'a'] < 0) {
                    good = false;
                    break;
                }
            }
            if (good == true) result += s.length();
        }
        return result;
    }
}
