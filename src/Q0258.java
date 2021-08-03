public class Q0258 {
    public int addDigits(int num) {
        //brute force
        int result=0;
        String s = ""+num;
        while(s.length()!=1){
            int temp =0;
            for(int i=0;i<s.length();i++){
                temp+=Character.getNumericValue(s.charAt(i));
            }
            s=""+temp;
        }
        result = Integer.valueOf(s);
        return result;
    }

}
