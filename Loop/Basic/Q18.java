import java.util.Scanner;

// Q18: WAP to count the factors of a number.
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (default 28): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 28;

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        System.out.println("Total factors of " + n + " are: " + count);
        sc.close();
    }
}
