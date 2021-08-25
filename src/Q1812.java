public class Q1812 {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - '0') % 2 == (coordinates.charAt(1) - 'a') % 2) ? true : false;
    }
}
