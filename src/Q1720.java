public class Q1720 {
    public static int[] decode(int[] encoded, int first) {
        int [] result = new int[encoded.length+1];
        result[0] =first;
        for(int i = 0;i<encoded.length;i++){
            result[i+1]=result[i]^encoded[i];
        }
        return  result;
    }

    public static void main(String[] args) {

    }
}
