import java.util.HashMap;

public class Q0003uf {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, index = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) > index) index = map.get(ch);
            }
            if (i - index > result) result = i - index;
            map.put(ch, i);
        }
        return result;
    }
}

