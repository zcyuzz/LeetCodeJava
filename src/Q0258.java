public class Q0258 {
    public int addDigits(int num) {
        //brute force without String
        int result =0;
        while (num>=0){
            while (num>0){
                result+=num%10;
                num/=10;
            }
            if(result<10) return result;
            num = result;
            result =0;
        }
        return result;
        //math
//        return num==0?0:(num%9==0?9:(num%9));
        //brute force with String
//        int result=0;
//        String s = ""+num;
//        while(s.length()!=1){
//            int temp =0;
//            for(int i=0;i<s.length();i++){
//                temp+=Character.getNumericValue(s.charAt(i));
//            }
//            s=""+temp;
//        }
//        result = Integer.valueOf(s);
//        return result;
    }

}
