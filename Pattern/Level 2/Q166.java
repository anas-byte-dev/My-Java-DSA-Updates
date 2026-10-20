import java.util.Scanner;

public class Q166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        // Total items for n=7 (mid=4): 1+3+5+7+5+3+1 = 25 = 2*mid^2 - 2*mid + 1
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += (i <= mid) ? 2 * i - 1 : 2 * (n - i) + 1;
        }
        int count = total;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int items = (i <= mid) ? 2 * i - 1 : 2 * (n - i) + 1;
            for (int s = 1; s <= spaces; s++) System.out.print("  ");
            for (int j = 1; j <= items; j++) System.out.print(count-- + " ");
            System.out.println();
        }
        sc.close();
    }
}
