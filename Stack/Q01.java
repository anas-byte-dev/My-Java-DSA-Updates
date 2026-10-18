import java.util.Scanner;

// Q1: Removing Stars From a String (LeetCode 2390)
public class Q01 {
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with stars (e.g. leet**cod*e): ");
        String s = sc.hasNext() ? sc.next() : "leet**cod*e";
        System.out.println("Result: " + removeStars(s));
        sc.close();
    }
}
