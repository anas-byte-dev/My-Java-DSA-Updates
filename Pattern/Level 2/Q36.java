import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        int totalCols = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i <= mid) {
                    if (j == 1 || j == totalCols) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i == n) {
                    System.out.print("* ");
                } else {
                    int stars = i - mid + 1;
                    if (j <= stars || j >= totalCols - stars + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
