import java.util.Scanner;

public class Q134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) System.out.print("  ");
            for (int j = i; j <= n; j++) System.out.print(j + " ");
            for (int j = n - 1; j >= i; j--) System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
