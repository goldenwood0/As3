package As3.Stack;
import java.util.Stack;

public class ex_4 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ex_4 n = new ex_4();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(s1 +": " + n.isValid(s1));
        System.out.println(s2 +": " + n.isValid(s2));
        System.out.println(s3 +": " + n.isValid(s3));
    }
}