public class Q1189 {
    public int maxNumberOfBalloons(String text) {
        int result = 0;
        //count character frenquency
        int[] count = new int[26];
        for (char ch : text.toCharArray()) {
            count[ch - 'a']++;
        }
        String ballon = "balloon";
        //count number of "ballon"
        while (true) {
            for (char ch : ballon.toCharArray()) {
                if (count[ch - 'a'] > 0) count[ch - 'a']--;
                else return result;
            }
            result++;
        }
    }
}
