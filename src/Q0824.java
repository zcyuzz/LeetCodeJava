import java.util.HashSet;

public class Q0824 {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        HashSet<Character> set = new HashSet<>();
        for (char ch : vowels.toCharArray()) set.add(ch);
        String[] strs = sentence.split(" ");
        int aCount = 1;
        for (String s : strs) {
            if (set.contains(s.charAt(0))) sb.append(s);
            else {
                sb.append(s.substring(1, s.length()));
                sb.append(s.charAt(0));
            }
            sb.append("ma");
            sb.append("a".repeat(aCount++));
            sb.append(" ");
        }
        //delete last space
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
