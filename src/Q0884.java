import java.util.ArrayList;
import java.util.HashSet;

public class Q0884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (String str : str1) {
            if (set.contains(str)) list.add(str);
            else set.add(str);
        }
        for (String str : str2) {
            if (set.contains(str)) list.add(str);
            else set.add(str);
        }
        for (String str : list) set.remove(str);
        return set.toArray(new String[]{});
    }
}
