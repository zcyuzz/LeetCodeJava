import java.util.ArrayList;

public class Q0821 {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> index = new ArrayList<>();
        index.add(-100000);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) index.add(i);
        }
        index.add(100001);
        int[] result = new int[s.length()];
        int previous = index.get(0), next = index.get(1);
        for (int i = 0; i < s.length(); i++) {
            if (i > next) {
                previous = next;
                next = index.get(index.indexOf(next) + 1);
            }
            result[i] = Math.min(Math.abs(i - previous), Math.abs(next - i));

        }
        return result;
    }
}