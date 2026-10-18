import java.util.Scanner;

// Q4: Make The String Great (LeetCode 1544)
public class Q04 {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && Math.abs(sb.charAt(len - 1) - c) == 32) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string (e.g. leEeetcode): ");
        String s = sc.hasNext() ? sc.next() : "leEeetcode";
        System.out.println("Good string: " + makeGood(s));
        sc.close();
    }
}
