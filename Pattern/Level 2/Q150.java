import java.util.Scanner;

public class Q150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        int total = mid * mid; // total numbers for n=7 (mid=4) is 1+2+3+4+3+2+1 = 16
        int count = total;

        for (int i = 1; i <= n; i++) {
            int spaces = (i <= mid) ? mid - i : i - mid;
            int items = (i <= mid) ? i : n - i + 1;
            for (int s = 1; s <= spaces; s++) System.out.print(" ");
            for (int j = 1; j <= items; j++) System.out.print(count-- + " ");
            System.out.println();
        }
        sc.close();
    }
}
