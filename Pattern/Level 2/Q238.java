import java.util.Scanner;

public class Q238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int val = (i <= mid) ? i : n - i + 1;
            char ch = (char) ('A' + val - 1);
            for (int j = 1; j <= n; j++) {
                if (Math.abs(mid - i) + Math.abs(mid - j) == mid - 1) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
