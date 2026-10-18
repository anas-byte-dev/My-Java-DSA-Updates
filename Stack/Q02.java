import java.util.Scanner;
import java.util.Stack;

// Q2: Backspace String Compare (LeetCode 844)
public class Q02 {
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string (e.g. ab#c): ");
        String s = sc.hasNext() ? sc.next() : "ab#c";
        System.out.print("Enter second string (e.g. ad#c): ");
        String t = sc.hasNext() ? sc.next() : "ad#c";

        System.out.println("Are equal after backspaces: " + backspaceCompare(s, t));
        sc.close();
    }
}
