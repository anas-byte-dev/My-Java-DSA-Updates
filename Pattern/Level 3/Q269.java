import java.util.Scanner;

public class Q269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            // Left arrow
            int leftStars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= leftStars; j++) System.out.print("* ");
            for (int s = 1; s <= mid - leftStars; s++) System.out.print("  ");

            // Bridge / middle pattern
            if (i <= mid) {
                for (int j = 1; j <= mid; j++) System.out.print("@ ");
            } else {
                for (int j = 1; j <= mid; j++) System.out.print("* ");
            }

            // Right arrow
            for (int s = 1; s <= mid - leftStars; s++) System.out.print("  ");
            for (int j = 1; j <= leftStars; j++) System.out.print("* ");

            System.out.println();
        }
        sc.close();
    }
}
