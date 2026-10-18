import java.util.Scanner;

public class Q18 {
    static boolean isFascinating(int n) {
        if (n < 100) return false;
        String s = "" + n + (n * 2) + (n * 3);
        if (s.length() != 9) return false;

        boolean[] seen = new boolean[10];
        for (char ch : s.toCharArray()) {
            int digit = ch - '0';
            if (digit == 0 || seen[digit]) return false;
            seen[digit] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is Fascinating? " + isFascinating(n));
        sc.close();
    }
}
