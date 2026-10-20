import java.util.Scanner;

public class Q282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = n / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i + 1 : i - mid - 1;
            int stars = n + 2 * (mid - spaces);
            for (int s = 1; s <= spaces; s++) System.out.print(" ");
            for (int j = 1; j <= stars; j++) System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
