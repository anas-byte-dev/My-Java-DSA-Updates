import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + "th Fibonacci term is: 0");
            sc.close();
            return;
        }

        long a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println(n + "th Fibonacci term is: " + b);
        sc.close();
    }
}
