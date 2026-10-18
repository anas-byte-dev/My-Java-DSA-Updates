import java.util.Scanner;

public class Q17 {
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

        if (isFascinating(n)) System.out.println(n + " is a Fascinating Number.");
        else System.out.println(n + " is NOT a Fascinating Number.");
        sc.close();
    }
}
