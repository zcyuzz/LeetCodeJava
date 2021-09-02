import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace('[', '{');
        s = s.replace(']', '}');
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        float x = (float) 33554431.0;
        float y = (float) 0.33554431;
        System.out.println(x);
        System.out.println(y);
        boolean[] testtt = new boolean[10];
        System.out.println(Arrays.toString(testtt));
    }


}


