import java.util.Arrays;

public class Q506uf {
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[] temp = new int[10001];
        for (int i = 0; i < score.length; i++) {
            temp[score[i]] = score[i];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i] + "";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(temp)));
    }

}
