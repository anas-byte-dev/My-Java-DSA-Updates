import java.util.Scanner;

public class Q173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int k = (i <= mid) ? i - 1 : n - i;
            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = k; j >= 0; j--) System.out.print(j + " ");
            for (int j = 1; j <= k; j++) System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
