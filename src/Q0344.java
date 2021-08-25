public class Q0344 {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < s.length / 2) {
            s[i] = (char) (s[i] ^ s[j]);
            s[j] = (char) (s[i] ^ s[j]);
            s[i] = (char) (s[i] ^ s[j]);
            i++;
            j--;
        }
    }
}
