import java.util.Scanner;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int total = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int start = total - (i * (i + 1) / 2);
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + start + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
