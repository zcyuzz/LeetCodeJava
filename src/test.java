import java.util.HashMap;
import java.util.Stack;

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
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}


