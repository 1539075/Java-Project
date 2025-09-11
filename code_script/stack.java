import java.util.*;
import java.util.Stack;
import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your digit: ");
        int digit = scan.nextInt();
        String hex = toHex(digit);
        System.out.println(hex);
        // if (hex.equalsIgnoreCase("30D4")) {
        // System.out.println("测试通过");
        // } else {
        // System.out.println("测试失败");
        // }
    }

    public static String toHex(int n) {
        // if (n == 0)
        // return "0";
        char[] digits = "0123456789ABCDEF".toCharArray();
        Stack hexStack = new Stack<String>();
        while (n > 0) {
            int remainder = n % 16;
            hexStack.push(digits[remainder]);
            n /= 16;
        }
        StringBuilder sb = new StringBuilder();
        while (!hexStack.isEmpty()) {
            sb.append(hexStack.pop());
        }
        hexStack.clear();
        return sb.toString();
    }
}
