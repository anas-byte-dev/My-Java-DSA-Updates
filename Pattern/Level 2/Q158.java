import java.util.Scanner;

public class Q158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int count = (i <= mid) ? i : n - i + 1;
            char ch = (char) ('A' + Math.abs(mid - i));
            for (int s = 1; s <= spaces; s++) System.out.print(" ");
            for (int j = 1; j <= count; j++) System.out.print(ch + " ");
            System.out.println();
        }
        sc.close();
    }
}
