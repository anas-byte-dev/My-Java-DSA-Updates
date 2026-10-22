import java.util.Scanner;

public class Q20 {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int oddSum(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i += 2) sum += i;
        return sum;
    }

    static int evenSum(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        for (int i = 2; i <= n; i += 2) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int oSum = oddSum(n);
        int eSum = evenSum(n);
        System.out.println("Odd sum: " + oSum + ", Even sum: " + eSum);
        System.out.println("GCD: " + gcd(oSum, eSum));
        sc.close();
    }
}
