import java.util.Scanner;

public class Q280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 7;
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? 2 * i - 1 : 2 * (n - i) + 1;
            int spaces = (i <= mid) ? mid - i : i - mid;

            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 1; j <= stars; j++) System.out.print("* ");
            for (int s = 1; s <= 5; s++) System.out.print("  ");
            for (int j = 1; j <= stars; j++) System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
