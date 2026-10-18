import java.util.Scanner;

// Q7: Remove Outermost Parentheses (LeetCode 1021)
public class Q07 {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) sb.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter valid parentheses string (e.g. (()())(())): ");
        String s = sc.hasNext() ? sc.next() : "(()())(())";
        System.out.println("After removing outermost parentheses: " + removeOuterParentheses(s));
        sc.close();
    }
}
