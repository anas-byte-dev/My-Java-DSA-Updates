import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int stars = (i <= mid) ? i : n - i + 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
