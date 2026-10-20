import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = n; j >= n - i + 1; j--) System.out.print(j + " ");
            for (int j = n - i + 2; j <= n; j++) System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
