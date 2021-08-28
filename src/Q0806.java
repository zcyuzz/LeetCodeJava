public class Q0806 {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int lastWidth = 0;
        for (char ch : s.toCharArray()) {
            int width = widths[ch - 'a'];
            if (lastWidth + width <= 100) lastWidth += width;
            else {
                lines++;
                lastWidth = width;
            }
        }
        return new int[]{lines, lastWidth};
    }
}
