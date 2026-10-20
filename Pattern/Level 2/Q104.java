import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print(ch++ + " ");
            System.out.println();
        }
        sc.close();
    }
}
