import java.util.Scanner;

public class Q222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= stars; j++) System.out.print(ch++ + " ");
            for (int s = 1; s <= n - 2 * stars; s++) System.out.print("  ");
            int jStart = (i == mid) ? 2 : 1;
            for (int j = jStart; j <= stars; j++) System.out.print(ch++ + " ");
            System.out.println();
        }
        sc.close();
    }
}
