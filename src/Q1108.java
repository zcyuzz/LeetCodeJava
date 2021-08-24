public class Q1108 {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        char[] ch = address.toCharArray();
        for (char c : ch) {
            if (c != '.') result.append(c);
            else result.append("[.]");
        }
        return result.toString();
    }
}
