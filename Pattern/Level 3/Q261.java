import java.util.Scanner;

public class Q261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        char[][] a = new char[n + 1][n + 1];
        char ch = 'A';
        for (int col = 1; col <= n; col++) {
            int j = n - col + 1;
            if (col % 2 == 1) {
                for (int i = col; i <= n; i++) a[i][j] = ch++;
            } else {
                for (int i = n; i >= col; i--) a[i][j] = ch++;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = n - i + 1; j <= n; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
