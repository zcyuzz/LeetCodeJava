public class Q1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char result = ' ';
        int[] duration = new int[releaseTimes.length];
        duration[0] = releaseTimes[0];
        for (int i = 1; i < duration.length; i++) {
            duration[i] = releaseTimes[i] - releaseTimes[i - 1];
        }
        int time = 0;
        for (int i = 0; i < duration.length; i++) {
            if (duration[i] == time) {
                if (keysPressed.charAt(i) > result) result = keysPressed.charAt(i);
            }
            if (duration[i] > time) {
                result = keysPressed.charAt(i);
                time = duration[i];
            }
        }
        return result;
    }
}
