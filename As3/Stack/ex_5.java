package As3.Stack;
import java.util.Stack;

public class ex_5 {
    public static int unableToEat(int[] students, int[] samsas) {
        int n = students.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            stack.push(samsas[i]);
        }
        int unableToEat = 0;
        for (int i = 0; i < n; i++) {
            int preference = students[i];
            if (stack.isEmpty()) {
                unableToEat += n - i;
                break;
            }
            int topSamsa = stack.peek();
            if (topSamsa == preference) {
                stack.pop();
            } else {
                stack.push(topSamsa);
            }
        }
        return unableToEat;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] samsas = {0, 1, 0, 1};
        System.out.println(unableToEat(students, samsas));
    }
}
