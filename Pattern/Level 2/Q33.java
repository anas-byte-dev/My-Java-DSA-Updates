import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int n = sc.nextInt();
        int totalCols = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || j <= n - i + 1 || j >= n + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
