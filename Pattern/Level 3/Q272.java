import java.util.Scanner;

public class Q272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Pyramid roof
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        // Base shaft
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n / 2; s++) System.out.print(" ");
            for (int j = 1; j <= (n % 2 == 1 ? n : n + 1); j++) System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
