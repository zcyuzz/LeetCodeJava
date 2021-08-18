public class Q1732 {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
            result = Math.max(result, altitude[i]);
        }
        return result;
    }
}
