import java.util.Scanner;
import java.util.Arrays;

public class Q22 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of primes): ");
        int n = sc.nextInt();

        int[] primes = new int[n];
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) primes[count++] = num;
            num++;
        }

        System.out.println("First " + n + " primes stored in array: " + Arrays.toString(primes));
        sc.close();
    }
}
