import java.util.Scanner;

public class Q10 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        int count = 0;

        System.out.print("Alternate Prime numbers: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (count % 2 == 0) System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        sc.close();
    }
}
