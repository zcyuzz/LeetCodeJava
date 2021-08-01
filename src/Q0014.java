public class Q0014 {
    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(result)) {
                int index = 0;
                for (int j = 0; j < result.length() && j < strs[i].length(); j++) {
                    if (strs[i].charAt(j) == result.charAt(j)) index++;
                    else break;
                }
                result = result.substring(0, index);
                if (result.equals("")) return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
