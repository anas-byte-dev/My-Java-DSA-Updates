import java.util.Scanner;

public class Q198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? i - 1 : n - i;
            int items = (i <= mid) ? 2 * (mid - i) + 1 : 2 * (i - mid) + 1;
            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 1; j <= items; j++) System.out.print(count++ + " ");
            System.out.println();
        }
        sc.close();
    }
}
