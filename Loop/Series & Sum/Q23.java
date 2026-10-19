import java.util.Scanner;

// Q23: WAJP to accept two numbers a and b and print power of a to b (a^b).
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (a): ");
        long a = sc.nextLong();
        System.out.print("Enter exponent (b): ");
        long b = sc.nextLong();

        long res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }

        System.out.println(a + " to the power " + b + " is: " + res);
        sc.close();
    }
}
