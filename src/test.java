import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace('[', '{');
        s = s.replace(']', '}');
        System.out.println(s);
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(3, 0);
        a.put(3, 1);
        System.out.println(a);
        System.out.println(9 % 10);
        System.out.println(9 / 10);


    }
}


