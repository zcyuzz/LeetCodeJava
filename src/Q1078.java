import java.util.ArrayList;

public class Q1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strs = text.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length - 2; i++) {
            if (strs[i].equals(first) && strs[i + 1].equals(second)) {
                list.add(strs[i + 2]);
            }
        }
        return list.toArray(new String[]{});
    }
}
