import java.util.Scanner;

public class Q16 {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }

        if (sum == n && n > 0) System.out.println(n + " is a Strong number.");
        else System.out.println(n + " is NOT a Strong number.");
        sc.close();
    }
}
