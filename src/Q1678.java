public class Q1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch == 'G') sb.append('G');
            if (ch == '(') {
                if (command.charAt(i + 1) == 'a') {
                    i += 3;
                    sb.append("al");
                } else {
                    i++;
                    sb.append('o');
                }
            }
        }
        return sb.toString();
    }
}
