import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println(n + "th Fibonacci term is: " + a);
        sc.close();
    }
}
