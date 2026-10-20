import java.util.Scanner;

public class Q210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? i - 1 : n - i;
            int k = (i <= mid) ? mid - i + 1 : i - mid + 1;
            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 0; j < k; j++) System.out.print((char) ('A' + j) + " ");
            for (int j = k - 2; j >= 0; j--) System.out.print((char) ('A' + j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
