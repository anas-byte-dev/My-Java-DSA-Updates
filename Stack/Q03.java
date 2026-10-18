import java.util.Scanner;

// Q3: Remove All Adjacent Duplicates In String (LeetCode 1047)
public class Q03 {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string (e.g. abbaca): ");
        String s = sc.hasNext() ? sc.next() : "abbaca";
        System.out.println("Result: " + removeDuplicates(s));
        sc.close();
    }
}
