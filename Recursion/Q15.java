import java.util.Scanner;

// LeetCode 1137: N-th Tribonacci Number
public class Q15 {
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return tribonacciHelper(n, new int[n + 1]);
    }

    private static int tribonacciHelper(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = tribonacciHelper(n - 1, memo) + tribonacciHelper(n - 2, memo) + tribonacciHelper(n - 3, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Tribonacci(" + n + ") = " + tribonacci(n));
        sc.close();
    }
}
