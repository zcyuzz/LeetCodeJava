import java.util.ArrayList;

public class Q1859 {
    public String sortSentence(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') sb.append(c);
            else {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        list.add(sb.toString());
        sb.setLength(0);
        String[] temp = new String[list.size()];
        for (String str : list) {
            temp[(str.charAt(str.length() - 1)) - '0' - 1] = str.substring(0, str.length() - 1);
        }
        for (String str : temp) {
            sb.append(str);
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
