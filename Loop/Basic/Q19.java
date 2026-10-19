import java.util.Scanner;

// Q19: WAP to print and count all factors of a number.
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal Factors: " + count);
        sc.close();
    }
}
