import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = i - 1; j <= 2 * i - 2; j++) System.out.print((char) ('A' + j) + " ");
            for (int j = 2 * i - 3; j >= i - 1; j--) System.out.print((char) ('A' + j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
