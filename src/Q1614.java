public class Q1614 {
    public int maxDepth(String s) {
        int result = 0;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') count++;
            if (ch == ')') count--;
            if (count > result) result = count;
        }
        return result;
    }
}
