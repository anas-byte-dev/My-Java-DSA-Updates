import java.util.Scanner;

public class Q05 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = reverse(n);

        if (n != rev && isPrime(n) && isPrime(rev)) {
            System.out.println(n + " is an Emirp number.");
        } else {
            System.out.println(n + " is NOT an Emirp number.");
        }
        sc.close();
    }
}
