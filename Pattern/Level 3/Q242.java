import java.util.Scanner;

public class Q242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int colFromRight = n - j + 1;
                int val = (j % 2 == 1) ? colFromRight * n - i + 1 : (colFromRight - 1) * n + i;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
