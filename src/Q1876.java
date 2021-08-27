import java.util.HashSet;

public class Q1876 {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length() - 2; i++) {
            boolean good = true;
            for (int j = i; j < i + 3; j++) {
                if (!set.contains(s.charAt(j))) set.add(s.charAt(j));
                else {
                    good = false;
                    break;
                }
            }
            set.clear();
            if (good == true) result++;
        }
        return result;
    }
}
