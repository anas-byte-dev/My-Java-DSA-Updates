import java.util.Scanner;

public class Q217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= stars; j++) System.out.print(j + " ");
            for (int s = 1; s <= n - 2 * stars; s++) System.out.print("  ");
            int jStart = (i == mid) ? stars - 1 : stars;
            for (int j = jStart; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
