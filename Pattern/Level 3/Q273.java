import java.util.Scanner;

public class Q273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 7;
        int topRows = (n + 1) / 2;

        for (int i = 1; i <= topRows; i++) {
            for (int s = 1; s <= topRows - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = 1; i <= n - topRows; i++) {
            for (int s = 1; s <= topRows - 1; s++) System.out.print("  ");
            System.out.println("* ");
        }
        sc.close();
    }
}
