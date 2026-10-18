import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long a = 0, b = 1, c = 1;
        for (int i = 1; i < n; i++) {
            long d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        System.out.println(n + "th Tribonacci term is: " + a);
        sc.close();
    }
}
