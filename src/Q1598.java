public class Q1598 {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String s : logs) {
            if (result != 0 && s.equals("../")) result--;
            else if (result == 0 && s.equals("../")) continue;
            else if (s.equals("./")) continue;
            else result++;
        }
        return result;
    }
}
