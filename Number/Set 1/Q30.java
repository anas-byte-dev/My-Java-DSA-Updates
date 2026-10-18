import java.util.Scanner;

public class Q30 {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();

        long ans = lcm(lcm(a, b), c);
        System.out.println("LCM of three numbers: " + ans);
        sc.close();
    }
}
