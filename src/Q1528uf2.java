public class Q1528uf2 {
    public static String restoreString(String s, int[] indices) {
        //brute force
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            for (int j =0;j<s.length();j++){
//                if(indices[j]==i){
//                    result += s.charAt(j);
//                }
//            }
//        }
//        return result;
        //using char array
        String result = "";
        int count = 0;
        char[] temp = new char[s.length()];
        for (int i : indices) {
            System.out.println(i);
            temp[count] = s.charAt(i);
            count++;
        }
        return new String(temp);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }
}
