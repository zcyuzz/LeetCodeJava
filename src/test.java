public class test {
    public static void main(String[] args) {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace('[', '{');
        s = s.replace(']', '}');
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 25; i++) {
            sb.append((char) ('a' + i));
            System.out.println("\"" + sb.toString() + "\"");
            System.out.println(3);
        }


    }
}


