import java.util.Scanner;

public class Q267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 11;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int minDist = Math.min(Math.min(i - 1, n - i), Math.min(j - 1, n - j));
                if (minDist % 2 == 1) System.out.print("* ");
                else System.out.print("@ ");
            }
            System.out.println();
        }
        sc.close();
    }
}
