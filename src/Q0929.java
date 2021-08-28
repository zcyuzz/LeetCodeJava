import java.util.HashSet;

public class Q0929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            int indexOfAt = email.indexOf('@');
            String local = email.substring(0, indexOfAt);
            String domain = email.substring(indexOfAt, email.length() - 1);
            StringBuilder sb = new StringBuilder();
            for (char ch : local.toCharArray()) {
                if (ch == '+') break;
                if (ch == '.') continue;
                sb.append(ch);
            }
            sb.append(domain);
            set.add(sb.toString());
        }
        return set.size();
    }
}
