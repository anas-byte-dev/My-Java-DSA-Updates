import java.util.Scanner;

public class Q239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                int start = (i - 1) * n + 1;
                for (int j = 0; j < n; j++) System.out.print((start + j) + " ");
            } else {
                int start = i * n;
                for (int j = 0; j < n; j++) System.out.print((start - j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
