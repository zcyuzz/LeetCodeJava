public class Q0009 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0, temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return x == reverse;
    }
}
