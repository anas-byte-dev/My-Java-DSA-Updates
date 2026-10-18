import java.util.Scanner;

public class Q15 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal Palindromic Prime count: " + count);
        sc.close();
    }
}
