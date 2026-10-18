import java.util.Scanner;

public class Q17 {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Strong numbers up to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
    }
}
