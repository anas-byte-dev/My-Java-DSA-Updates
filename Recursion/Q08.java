import java.util.Scanner;

public class Q08 {
    static long power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (a) and exponent (b): ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(a + "^" + b + " = " + power(a, b));
        sc.close();
    }
}
