import java.util.Stack;

public class Q1047uf2 {
    public String removeDuplicates(String s) {
        //abbaca
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.empty() || stack.peek() != ch) stack.push(ch);
            else stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) sb.append(ch);
        return sb.toString();
    }
}
