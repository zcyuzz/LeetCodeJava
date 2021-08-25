import java.util.HashSet;
import java.util.List;

public class Q1436 {
    public String destCity(List<List<String>> paths) {
        HashSet<String> start = new HashSet<>();
        HashSet<String> dest = new HashSet<>();
        for (List<String> list : paths) {
            start.add(list.get(0));
            dest.add(list.get(1));
        }
        for (String s : dest) {
            if (!start.contains(s)) return s;
        }
        return new String();
    }
}
