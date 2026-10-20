import java.util.Scanner;

public class Q258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];
        int val = 1;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 1) {
                for (int i = n; i >= j; i--) a[i][j] = val++;
            } else {
                for (int i = j; i <= n; i++) a[i][j] = val++;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
