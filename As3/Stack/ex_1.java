package As3.Stack;
import java.util.*;
public class ex_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedList<Integer> shelf = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int op = sc.nextInt();
                if (op == 1) {
                    int disk = sc.nextInt();
                    shelf.addFirst(disk);
                } else if (op == 2) {
                    int disk = sc.nextInt();
                    shelf.addLast(disk);
                } else if (op == 3) {
                    int disk = shelf.removeFirst();
                    System.out.print(disk + " ");
                } else if (op == 4) {
                    int disk = shelf.removeLast();
                    System.out.print(disk + " ");
                }
            }
        }
    }
