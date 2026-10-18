import java.util.Scanner;

public class Q12 {
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
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isCircularPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal: " + count);
        sc.close();
    }
}
