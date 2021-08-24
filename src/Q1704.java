import java.util.HashSet;

public class Q1704 {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> vowels = new HashSet<>();
        String vowelsString = "aeiouAEIOU";
        for (char ch : vowelsString.toCharArray()) {
            vowels.add(ch);
        }
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.contains(s.charAt(i))) count++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count--;
        }
        return count == 0 ? true : false;
    }
}
