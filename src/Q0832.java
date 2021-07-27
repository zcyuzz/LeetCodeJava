

public class Q0832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[] temp = new int[n];
        for (int i = 0; i < image.length; i++) {
            temp = image[i].clone();
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = temp[n - j - 1];
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        image = flipAndInvertImage(image).clone();
        System.out.println("----------------------------------");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
