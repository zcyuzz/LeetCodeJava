import java.util.ArrayList;
import java.util.List;

public class Q1408 {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String s : words) sb.append(s).append(" ");
        String str = sb.toString();
        for (String s : words) {
            if (str.indexOf(s) != str.lastIndexOf(s)) list.add(s);
        }
        return list;
    }
}
