import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        if (sum == n) System.out.println(n + " is a Neon number.");
        else System.out.println(n + " is NOT a Neon number.");
        sc.close();
    }
}
