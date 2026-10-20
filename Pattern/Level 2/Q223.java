import java.util.Scanner;

public class Q223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            total += (i == mid) ? 2 * stars - 1 : 2 * stars;
        }
        char ch = (char) ('A' + total - 1);

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= stars; j++) System.out.print(ch-- + " ");
            for (int s = 1; s <= n - 2 * stars; s++) System.out.print("  ");
            int jStart = (i == mid) ? 2 : 1;
            for (int j = jStart; j <= stars; j++) System.out.print(ch-- + " ");
            System.out.println();
        }
        sc.close();
    }
}
