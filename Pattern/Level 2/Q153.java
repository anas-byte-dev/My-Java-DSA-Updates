import java.util.Scanner;

public class Q153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int count = (i <= mid) ? i : n - i + 1;
            int val = Math.abs(mid - i);
            for (int s = 1; s <= spaces; s++) System.out.print(" ");
            for (int j = 1; j <= count; j++) System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}
