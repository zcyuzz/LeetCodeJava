public class test {
    public static void main(String[] args) {
        String s = "[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]";
        s = s.replace('[', '{');
        s = s.replace(']', '}');
        System.out.println(s);
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 += (char) ((int) (Math.random() * 100));
        }
        System.out.println(s1);
        int count1 = 0;
        int count2 = 0;
        long start = System.nanoTime();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 1) count1++;
        }
        long end = System.nanoTime();
        System.out.println(start - end);
        start = System.nanoTime();
        for (char c : s1.toCharArray()) {
            if (c == 1) count2++;
        }
        end = System.nanoTime();
        System.out.println(start - end);


    }
}


