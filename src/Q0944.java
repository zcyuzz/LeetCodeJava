public class Q0944 {
    public int minDeletionSize(String[] strs) {
        int result = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}