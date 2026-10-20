import java.util.Scanner;

public class Q240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int base = n * n - i * n;
            if ((n - i) % 2 == 0) {
                for (int j = n; j >= 1; j--) System.out.print((base + j) + " ");
            } else {
                for (int j = 1; j <= n; j++) System.out.print((base + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
