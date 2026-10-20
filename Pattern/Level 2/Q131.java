import java.util.Scanner;

public class Q131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * (n - i) + 1; j++) System.out.print((n - i + 1) + " ");
            System.out.println();
        }
        sc.close();
    }
}
