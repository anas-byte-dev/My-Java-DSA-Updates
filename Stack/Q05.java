import java.util.Scanner;
import java.util.Stack;

// Q5: Valid Parentheses (LeetCode 20)
public class Q05 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string (e.g. ()[]{}): ");
        String s = sc.hasNext() ? sc.next() : "()[]{}";
        System.out.println("Is valid: " + isValid(s));
        sc.close();
    }
}
