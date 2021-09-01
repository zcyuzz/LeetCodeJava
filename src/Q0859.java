public class Q0859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.length() == 1) return false;
        //number of different characters at same index in two string.
        int differentCharacter = 0;
        //index that characters are different
        int[] index = new int[2];
        //pointer of index
        int temp = 0;
        //count differentCharacters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (differentCharacter < 2) {
                    differentCharacter++;
                    index[temp++] = i;
                } else return false;
            }
        }
        //if two strings are equal,if length =1 return true, or we need to see if they contains any character more
        // than once;
        if (differentCharacter == 0) {
            if (s.length() == 1) return true;
            //count 26 lowercase character
            int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
                if (count[ch - 'a'] > 1) return true;
            }
            return false;
        }
        if (s.charAt(index[0]) == goal.charAt(index[1]) && s.charAt(index[1]) == goal.charAt(index[0])) return true;
        return false;
    }
}
