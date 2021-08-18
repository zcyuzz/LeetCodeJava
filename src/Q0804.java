import java.util.HashSet;

public class Q0804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--"
                , "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String s = "";
            for (int j = 0; j < words[i].length(); j++) {
                s += codes[words[i].charAt(j) - 'a'];
            }
            set.add(s);
        }
        return set.size();
    }
}
