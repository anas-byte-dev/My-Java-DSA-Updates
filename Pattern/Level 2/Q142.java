import java.util.Scanner;

public class Q142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) System.out.print("  ");
            for (int j = 2 * (n - i); j >= 0; j--) System.out.print((char) ('A' + j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
