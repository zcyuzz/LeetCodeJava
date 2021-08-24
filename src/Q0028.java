public class Q0028 {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        char start = needle.charAt(0);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == start) {
                boolean contains = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        contains = false;
                        break;
                    }
                }
                if (contains == true) return i;
            }
        }
        return -1;
    }
}
