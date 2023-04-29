package As3.Stack;
import java.util.Stack;
import java.util.Arrays;
public class ex_2 {
    public static void main(String[] args) {
        int[] prices = {6, 4, 1, 7, 22};
        ex_2 ans = new ex_2();
        int[] discountedPrices = ans.finalPrices(prices);
        System.out.println(Arrays.toString(discountedPrices));

    }
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] discounts = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                discounts[stack.pop()] = prices[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < prices.length; i++) {
            if (discounts[i] != 0) {
                prices[i] -= discounts[i];
            }
        }
        return prices;
    }
}

