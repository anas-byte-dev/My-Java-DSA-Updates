import java.util.Scanner;

public class Q276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 4;

        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < 3; k++) {
                for (int s = 1; s <= n - i; s++) System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
                for (int s = 1; s <= n - i; s++) System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
