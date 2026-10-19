import java.util.Scanner;

// Q23: Number of Common Factors (LeetCode 2427)
public class Q23 {
    public static int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number b: ");
        int b = sc.nextInt();

        System.out.println("Number of common factors: " + commonFactors(a, b));
        sc.close();
    }
}
