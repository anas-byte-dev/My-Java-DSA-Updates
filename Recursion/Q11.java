import java.util.Scanner;

public class Q11 {
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = (n == 0) ? 1 : countDigits(Math.abs(n));
        System.out.println("Digit count: " + count);
        sc.close();
    }
}
