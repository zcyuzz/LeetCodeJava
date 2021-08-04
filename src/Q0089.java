import java.util.ArrayList;
import java.util.List;

public class Q0089 {
    public static List<Integer> grayCode(int n) {
        ArrayList<String> temp = new ArrayList<>();
        temp.add("0");
        temp.add("1");
        ArrayList<String> temp2 = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < temp.size(); j++) {
                temp2.add("0" + temp.get(j));
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                temp2.add("1" + temp.get(j));
            }
            temp.clear();
            temp.addAll(temp2);
            temp2.clear();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            result.add(Integer.parseInt(temp.get(i), 2));
        }
        return result;
    }


    public static void main(String[] args) {
        grayCode(15);
        System.out.println(grayCode(28));
    }

}

