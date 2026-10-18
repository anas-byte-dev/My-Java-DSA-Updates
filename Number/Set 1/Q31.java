import java.util.Scanner;

public class Q31 {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int ans = gcd(gcd(a, b), c);
        System.out.println("GCD/HCF of three numbers: " + ans);
        sc.close();
    }
}
