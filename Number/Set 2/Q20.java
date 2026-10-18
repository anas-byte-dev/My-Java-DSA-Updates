import java.util.Scanner;

public class Q20 {
    static boolean isBouncy(int n) {
        String s = Integer.toString(n);
        boolean inc = false, dec = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) < s.charAt(i + 1)) inc = true;
            if (s.charAt(i) > s.charAt(i + 1)) dec = true;
        }

        return inc && dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isBouncy(n)) System.out.println(n + " is a Bouncy Number.");
        else System.out.println(n + " is NOT a Bouncy Number.");
        sc.close();
    }
}
