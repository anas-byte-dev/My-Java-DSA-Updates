import java.util.Scanner;

public class Q19 {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("HCF/GCD: " + gcd(a, b));
        sc.close();
    }
}
