import java.util.ArrayList;
import java.util.HashSet;

public class Q1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> word = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (char ch : text.toCharArray()) {
            if (ch != ' ') sb.append(ch);
            else {
                word.add(sb.toString());
                sb.setLength(0);
            }
        }
        word.add(sb.toString());
        for (char ch : brokenLetters.toCharArray()) set.add(ch);
        for (String s : word) {
            boolean broken = false;
            for (char ch : s.toCharArray()) {
                if (set.contains(ch)) {
                    broken = true;
                    break;
                }
            }
            if (broken == false) result++;
        }
        return result;
    }

}
