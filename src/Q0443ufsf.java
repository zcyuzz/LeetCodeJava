public class Q0443ufsf {
    public int compress(char[] chars) {
        if (chars.length == 1) return chars.length;
        int i = 0;
        int l = 0;
        int r = 0;
        while (r < chars.length) {
            int count = 0;
            char val = chars[l];
            while (r < chars.length && chars[r] == val) {
                count++;
                r++;
            }
            chars[i] = val;
            i++;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[i] = c;
                    i++;
                }
            }
            l = r;
        }
        return i;
    }
}
