import java.util.Scanner;

public class Q16 {
    static boolean isKaprekar(long n) {
        if (n == 1) return true;
        long sq = n * n;
        String s = Long.toString(sq);
        int len = s.length();

        for (int i = 1; i < len; i++) {
            long left = Long.parseLong(s.substring(0, i));
            long right = Long.parseLong(s.substring(i));
            if (right != 0 && left + right == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        if (isKaprekar(n)) System.out.println(n + " is a Kaprekar number.");
        else System.out.println(n + " is NOT a Kaprekar number.");
        sc.close();
    }
}
