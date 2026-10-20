import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int start = 1 + (i * (i - 1)) / 2;
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print((start + j) + " ");
            for (int j = i - 2; j >= 0; j--) System.out.print((start + j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
