import java.util.Scanner;

// Q22: WAJP to accept input from user and print factorial of that number.
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n (e.g. 6): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 6;

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
        sc.close();
    }
}
