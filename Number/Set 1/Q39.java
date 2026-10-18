import java.util.Scanner;

public class Q39 {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r: ");
        int n = sc.nextInt(), r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input!");
        } else {
            long nCr = fact(n) / (fact(r) * fact(n - r));
            System.out.println("nCr: " + nCr);
        }
        sc.close();
    }
}
