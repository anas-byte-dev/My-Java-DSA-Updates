import java.util.Scanner;

// [TCS NQT 2024]
public class Q11 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
        sc.close();
    }
}
