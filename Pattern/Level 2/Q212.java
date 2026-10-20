import java.util.Scanner;

public class Q212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= n; j++) {
                if (j <= stars || j >= n - stars + 1) System.out.print(i + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
