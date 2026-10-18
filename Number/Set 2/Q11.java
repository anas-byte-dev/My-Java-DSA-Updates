import java.util.Scanner;

public class Q11 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isCircularPrime(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int val = Integer.parseInt(s);
            if (!isPrime(val)) return false;
            s = s.substring(1) + s.charAt(0);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isCircularPrime(n)) System.out.println(n + " is a Circular Prime.");
        else System.out.println(n + " is NOT a Circular Prime.");
        sc.close();
    }
}
