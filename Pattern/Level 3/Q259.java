import java.util.Scanner;

public class Q259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int totalBefore = i * (i - 1) / 2;
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) System.out.print((char) ('A' + totalBefore + j - 1) + " ");
            } else {
                for (int j = i; j >= 1; j--) System.out.print((char) ('A' + totalBefore + j - 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
