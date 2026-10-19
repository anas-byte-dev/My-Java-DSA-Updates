import java.util.Scanner;

// Q17: WAP to print all factors of a number.
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (default 28): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 28;

        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
