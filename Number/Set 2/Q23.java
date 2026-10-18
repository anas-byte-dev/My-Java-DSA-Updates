import java.util.Scanner;

public class Q23 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (!isPrime(n)) {
            System.out.println(n + " is NOT a Prime number, hence NOT a Super Prime.");
        } else {
            int primeIndex = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) primeIndex++;
            }
            if (isPrime(primeIndex)) {
                System.out.println(n + " is a Super Prime (rank " + primeIndex + " is prime).");
            } else {
                System.out.println(n + " is NOT a Super Prime (rank " + primeIndex + " is not prime).");
            }
        }
        sc.close();
    }
}
