import java.util.Scanner;
import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();

        long[] fib = new long[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) fib[i] = fib[i - 1] + fib[i - 2];

        System.out.println("First " + n + " terms of Fibonacci in array: " + Arrays.toString(fib));
        sc.close();
    }
}
