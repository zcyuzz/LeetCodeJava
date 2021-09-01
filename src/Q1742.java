public class Q1742 {
    public int countBalls(int lowLimit, int highLimit) {
        //45=9+9+9+9+9 which is max possible value, 46 = total number from 0 to 45
        int[] count = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            //calculate sum of digits
            int sum = 0, temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }
        int result = 0;
        //find max
        for (int i : count) {
            if (i > result) result = i;
        }
        return result;
    }
}
