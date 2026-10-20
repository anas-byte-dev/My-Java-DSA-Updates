import java.util.Scanner;

public class Q181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int items = (i <= mid) ? 2 * i - 1 : 2 * (n - i) + 1;
            int midCol = (items + 1) / 2;

            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 1; j <= items; j++) {
                if (i == mid || j == midCol) {
                    System.out.print("@ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
