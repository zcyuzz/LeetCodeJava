import java.util.ArrayList;

public class Q1309 {
    public String freqAlphabets(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.append(s.charAt(i - 2));
                sb.append(s.charAt(i - 1));
                list.add(sb.toString());
                sb.setLength(0);
                i -= 2;
            } else list.add(s.charAt(i) + "");
        }
        sb.setLength(0);
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append((char) ('a' + Integer.parseInt(list.get(i)) - 1));
        }
        return sb.toString();
    }
}
