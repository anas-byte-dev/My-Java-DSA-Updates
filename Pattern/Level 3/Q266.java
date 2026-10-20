import java.util.Scanner;

public class Q266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int minDist = Math.min(Math.min(i - 1, n - i), Math.min(j - 1, n - j));
                System.out.print((mid - minDist) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
