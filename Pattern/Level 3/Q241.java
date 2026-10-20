import java.util.Scanner;

public class Q241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int val = (j % 2 == 1) ? (j - 1) * n + i : j * n - i + 1;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
