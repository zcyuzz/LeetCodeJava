import java.util.ArrayList;

public class Q0557uf2 {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') sb.append(s.charAt(i));
            else {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        list.add(sb.toString());
        sb.setLength(0);
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i) + ' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
