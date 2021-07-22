public class Q0942 {
    public int[] diStringMatch(String s) {
        int end = s.length();
        int tempEnd = end;
        int start = 0;
        int[] result = new int[end + 1];
        for (int i = 0; i < end; i++) {
            result[i] = s.charAt(i) == 'I' ? start++ : tempEnd--;
        }
        result[end] = start;
        return result;
    }
}
