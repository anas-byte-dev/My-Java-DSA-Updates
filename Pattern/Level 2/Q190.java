import java.util.Scanner;

public class Q190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int count = (i <= mid) ? 2 * i - 1 : 2 * (n - i) + 1;
            int rowIdx = (i <= mid) ? i : n - i + 1;
            char ch = (char) ('A' + rowIdx - 1);
            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 1; j <= count; j++) System.out.print(ch + " ");
            System.out.println();
        }
        sc.close();
    }
}
